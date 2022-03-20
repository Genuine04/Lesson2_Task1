package uz.pdp.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task1.entity.Input;
import uz.pdp.task1.entity.Measurement;

@Projection(types = Measurement.class)
public interface MeasurementProjection {

    Long getId();

    String getName();

    boolean isActive();
}
