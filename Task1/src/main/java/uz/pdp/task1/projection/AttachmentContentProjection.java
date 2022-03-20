package uz.pdp.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task1.entity.Attachment;
import uz.pdp.task1.entity.AttachmentContent;

import javax.persistence.OneToOne;

@Projection(types = AttachmentContent.class)
public interface AttachmentContentProjection {

    Long getId();

    byte[] getBytes();

    Attachment getAttachment();

}
