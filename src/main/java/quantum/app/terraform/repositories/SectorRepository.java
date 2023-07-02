package quantum.app.terraform.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import quantum.app.terraform.models.Product;
import quantum.app.terraform.models.Sector;

@Repository
@RestResource(path = "sectors", rel = "sectors")
public interface SectorRepository extends PagingAndSortingRepository<Sector, String> {
}
