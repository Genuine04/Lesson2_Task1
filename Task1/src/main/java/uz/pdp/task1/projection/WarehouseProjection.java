package uz.pdp.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task1.entity.User;
import uz.pdp.task1.entity.Warehouse;

import java.util.List;

@Projection(types = Warehouse.class)
public interface WarehouseProjection {

    Long getId();

    String getName();

    boolean isActive();

    List<User> getUser();

}
