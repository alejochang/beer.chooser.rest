package beer.chooser.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import beer.chooser.rest.domain.Product;
import beer.chooser.rest.repository.ProductRepository;

@Service("productService")
public class ProductServiceImpl implements ProductService {
	
	ProductRepository repository;

	@Autowired
	public ProductServiceImpl(ProductRepository repository) {		
		this.repository = repository;
	}

	@Override
	public Product getBeerAlreadyTried(String id) {
		return this.repository.findById(id);
	}

	@Override
	public Product saveBeerAsTried(Product beer) {
		return this.repository.save(beer);
		
	}

	@Override
	public List<Product> getPreviousChoices() {
		return this.repository.findAll(new Sort(Direction.DESC, "createdDate")); 
	}
	
	@Override
	public List<Product> getPreviousChoicesSortedByField(String field, Direction direction) {
		return this.repository.findAll(new Sort(direction, field)); 
	}
}