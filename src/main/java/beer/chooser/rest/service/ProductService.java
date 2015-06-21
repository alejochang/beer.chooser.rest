package beer.chooser.rest.service;

import java.util.List;

import beer.chooser.rest.domain.Product;

public interface ProductService {
	
	public Product getBeerAlreadyTried(String id);

    public Product saveBeerAsTried(Product beer);
    
    public List<Product> getPreviousChoices();    
}
