package pe.cronos.global.infrastructure.database.project.repository;

import org.springframework.stereotype.Component;
import pe.cronos.global.infrastructure.database.project.entity.ProjectEntity;

@Component
public class ProjectRepository {

    public ProjectEntity getProjectInfo() {
        ProjectEntity projectEntity = new ProjectEntity();
        projectEntity.setName("Subtraction Project");
        projectEntity.setVersion("1.0.0");

        return projectEntity;
    }
}
