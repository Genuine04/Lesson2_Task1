package uz.pdp.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task1.entity.*;

@Projection(types = Supplier.class)
public interface SupplierProjection {

    Long getId();

    String getName();

    boolean isActive();

    String getPhoneNumber();

}
