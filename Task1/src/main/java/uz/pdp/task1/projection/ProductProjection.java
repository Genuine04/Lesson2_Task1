package uz.pdp.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task1.entity.*;

@Projection(types = Product.class)
public interface ProductProjection {

    Long getId();

    String getName();

    Category getCategory();

    Attachment getPhoto();

    String getCode();

    Measurement getMeasurement();

}
