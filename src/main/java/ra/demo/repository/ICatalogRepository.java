package ra.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ra.demo.model.Catalog;

public interface ICatalogRepository extends JpaRepository<Catalog,Long> {
}
