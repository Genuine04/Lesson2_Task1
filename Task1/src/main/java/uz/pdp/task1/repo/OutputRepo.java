package uz.pdp.task1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task1.entity.Output;

@RepositoryRestResource(path = "output", excerptProjection = Output.class)
public interface OutputRepo extends JpaRepository<Output, Long> {
}
