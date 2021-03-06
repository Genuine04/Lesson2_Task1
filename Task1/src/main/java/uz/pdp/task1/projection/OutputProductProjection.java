package uz.pdp.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task1.entity.Output;
import uz.pdp.task1.entity.OutputProduct;
import uz.pdp.task1.entity.Product;

@Projection(types = OutputProduct.class)
public interface OutputProductProjection {

    Long getId();

    Product getProduct();

    Integer getAmount();

    double getPrice();

    Output getOutput();

}
