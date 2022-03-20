package uz.pdp.task1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task1.entity.OutputProduct;
import uz.pdp.task1.projection.OutputProductProjection;

@RepositoryRestResource(path = "outputProduct", excerptProjection = OutputProductProjection.class)
public interface OutputProductRepo extends JpaRepository<OutputProduct, Long> {
}
