package beer.chooser.rest.controller;

import groovy.util.OrderBy;

import java.util.Calendar;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import beer.chooser.rest.BeerChooserProperties;
import beer.chooser.rest.domain.Product;
import beer.chooser.rest.domain.StoreInventory;
import beer.chooser.rest.service.ProductService;

/*
 * @author: Alejandro Chang alejochang@gmail.com
 * Exposes resources to manage beer choices from LCBO API
 * 
 */
@RestController
@RequestMapping("/beer")
@EnableConfigurationProperties(BeerChooserProperties.class)
public class ProductController {
	private static final Logger log = LoggerFactory
			.getLogger(ProductController.class);

	@Autowired
	private ProductService productService;
	
	@Autowired
	private BeerChooserProperties appConfig;

	@RequestMapping(value = "save", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Void> saveBeerAsTried(@RequestBody Product beer) {

		if (beer != null) {
			beer.setCreatedDate(Calendar.getInstance().getTime());
			Product result = this.productService.saveBeerAsTried(beer);
			if (result != null) {
				return new ResponseEntity<Void>(HttpStatus.CREATED);
			} else {
				new ResponseEntity<Void>(HttpStatus.CONFLICT);
			}

		}

		return new ResponseEntity<Void>(HttpStatus.PRECONDITION_FAILED);
	}

	@RequestMapping(value = "get/{beerId}", method = RequestMethod.GET)
	public Product getBeer(@PathVariable("beerId") String id) {

		log.info("Getting beer for :" + id);

		Product result = this.productService.getBeerAlreadyTried(id);

		return result;

	}

	@RequestMapping(value = "get", method = RequestMethod.GET)
	public List<Product> getPreviousChoices() {

		log.info("Getting historical choices");

		return this.productService.getPreviousChoices();

	}
	
	@RequestMapping(value = "get/sort/by/{field}/{direction}", method = RequestMethod.GET)
	public List<Product> getPreviousChoicesSortedByField(@PathVariable("field") String field, @PathVariable("direction")  String direction) {
		Direction dr = Direction.valueOf(direction.toUpperCase());
		return this.productService.getPreviousChoicesSortedByField(field, dr);

	}

	@RequestMapping(value = "get/choice", method = RequestMethod.GET)
	public Product getChoiceOfTheDay() {
		log.info("Getting choice of the day");
		
		return getAvailableBeer(1);

	}

	private Product getAvailableBeer(int page) {
		Random random = new Random();
		log.info("Getting choice of the day");
		StoreInventory inventory = loadLCBOInventory(page);
		Product choice = null;
		int counter = 0;

		if (!inventory.getProducts().isEmpty()) {

			while (choice == null && counter < inventory.getProducts().size() - 1) {
				choice = inventory.getProducts().get(
						random.nextInt(inventory.getProducts().size()));
				counter++;
				if (this.productService.getBeerAlreadyTried(choice.getId()) != null) {
					choice = null;
				}
			}
		}
		
		if(choice == null && !Boolean.getBoolean(inventory.getPager().getIsFinalPage())){
			return getAvailableBeer(page + 1);
		}
		return choice;
	}

	private StoreInventory loadLCBOInventory(int page) {
		RestTemplate restTemplate = new RestTemplate();
		StringBuilder urlApiCall =  new StringBuilder("http://");
		urlApiCall.append(appConfig.getLcboAppiAccessKey());
		urlApiCall.append(":x-access-key@lcboapi.com/");
		//Store
		urlApiCall.append("stores/");
		urlApiCall.append(appConfig.getLcboStoreId());
		//Inventory
		urlApiCall.append("/products/");
		//Only beers, not dead or discontinued
		urlApiCall.append("?q=beer&where_not=is_dead,is_discontinued");
		//Max records per page allowed
		urlApiCall.append("&per_page=100");
		//Page
		urlApiCall.append("&page=");
		urlApiCall.append(page);
		return restTemplate
				.getForObject(urlApiCall.toString(), StoreInventory.class);
	}

}
