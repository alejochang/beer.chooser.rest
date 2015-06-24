package beer.chooser.rest.service;

import java.util.List;

import org.springframework.data.domain.Sort.Direction;

import beer.chooser.rest.domain.Product;

public interface ProductService {
	
	public Product getBeerAlreadyTried(String id);

    public Product saveBeerAsTried(Product beer);
    
    public List<Product> getPreviousChoices();    
    
    public List<Product> getPreviousChoicesSortedByField(String field, Direction direction);
}
