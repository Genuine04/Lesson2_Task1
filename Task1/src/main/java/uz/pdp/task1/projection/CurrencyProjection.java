package uz.pdp.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task1.entity.Currency;

@Projection(types = Currency.class)
public interface CurrencyProjection {

    Long getId();

    String getName();

    boolean isActive();

}
