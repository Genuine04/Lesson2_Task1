package uz.pdp.task1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task1.entity.Product;
import uz.pdp.task1.projection.ProductProjection;

@RepositoryRestResource(path = "product", excerptProjection = ProductProjection.class)
public interface ProductRepo extends JpaRepository<Product, Long> {
}
