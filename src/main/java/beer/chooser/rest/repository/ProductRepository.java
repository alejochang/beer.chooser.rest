
package beer.chooser.rest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import beer.chooser.rest.domain.Product;

@RepositoryRestResource(collectionResourceRel = "products", path = "p")
public interface ProductRepository extends MongoRepository<Product, String> {
	Product findById(@Param("id") String id);
}
