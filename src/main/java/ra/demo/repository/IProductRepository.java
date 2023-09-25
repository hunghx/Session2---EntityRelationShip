package ra.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ra.demo.model.Product;

import java.util.List;

// Repository -> CrudRepository-> PagingAndSortingRepository -> JpaRepository
@Repository
public interface IProductRepository extends JpaRepository<Product,Long> {
       @Query("select p from Product as p")
        List<Product> joinCatalog();
}
