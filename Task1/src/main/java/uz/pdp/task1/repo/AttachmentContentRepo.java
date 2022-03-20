package uz.pdp.task1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task1.entity.AttachmentContent;
import uz.pdp.task1.projection.AttachmentContentProjection;

@RepositoryRestResource(path = "attachmentContent", excerptProjection = AttachmentContentProjection.class)
public interface AttachmentContentRepo extends JpaRepository<AttachmentContent, Long> {
}
