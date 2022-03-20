package uz.pdp.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task1.entity.*;

import javax.persistence.ManyToOne;
import java.util.Date;

@Projection(types = Output.class)
public interface OutputProjection {

    Long getId();

    Date getDate();

    Warehouse getWarehouse();

    Currency getCurrency();

    int getFactureNumber();

    String getCode();

    Client getClient();

}
