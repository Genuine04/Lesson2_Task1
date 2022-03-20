package uz.pdp.task1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task1.entity.Client;
import uz.pdp.task1.projection.ClientProjection;

@RepositoryRestResource(path = "client", excerptProjection = ClientProjection.class)
public interface ClientRepo extends JpaRepository<Client, Long> {
}
