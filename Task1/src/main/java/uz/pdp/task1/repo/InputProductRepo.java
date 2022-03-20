package uz.pdp.task1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task1.entity.InputProduct;
import uz.pdp.task1.projection.InputProductProjection;

@RepositoryRestResource(path = "inputProduct", excerptProjection = InputProductProjection.class)
public interface InputProductRepo extends JpaRepository<InputProduct, Long> {
}
