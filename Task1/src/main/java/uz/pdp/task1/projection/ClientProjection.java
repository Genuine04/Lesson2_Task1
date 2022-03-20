package uz.pdp.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task1.entity.Client;

import javax.persistence.Column;

@Projection(types = Client.class)
public interface ClientProjection {

    Long getId();

    String getName();

    String getPhoneNumber();

}
