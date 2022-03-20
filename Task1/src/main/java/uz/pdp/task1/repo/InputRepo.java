package uz.pdp.task1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task1.entity.Input;
import uz.pdp.task1.projection.InputProjection;

@RepositoryRestResource(path = "input", excerptProjection = InputProjection.class)
public interface InputRepo extends JpaRepository<Input, Long> {
}
