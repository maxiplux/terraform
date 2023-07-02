package quantum.app.terraform.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import quantum.app.terraform.models.Product;

@Repository
@RestResource(path = "products", rel = "products")
public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
}
