package uz.pdp.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task1.entity.Input;
import uz.pdp.task1.entity.InputProduct;
import uz.pdp.task1.entity.Product;

import java.util.Date;

@Projection(types = InputProduct.class)
public interface InputProductProjection {

    Long getId();

    Product getProduct();

    Integer getAmount();

    double getPrice();

    Date getExpireDate();

    Input getInput();

}
