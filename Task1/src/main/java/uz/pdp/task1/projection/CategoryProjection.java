package uz.pdp.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task1.entity.Category;

import javax.persistence.ManyToOne;

@Projection(types = Category.class)
public interface CategoryProjection {

    Long getId();

    String getName();

    Category getParentCategory();

    boolean isActive();

}
