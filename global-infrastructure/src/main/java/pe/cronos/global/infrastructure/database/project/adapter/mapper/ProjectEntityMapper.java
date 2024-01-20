package pe.cronos.global.infrastructure.database.project.adapter.mapper;

import org.springframework.stereotype.Component;
import pe.cronos.global.domain.model.entity.Project;
import pe.cronos.global.infrastructure.database.project.entity.ProjectEntity;

@Component
public class ProjectEntityMapper {

    public Project map(ProjectEntity projectEntity) {
        Project project = new Project();
        project.setName(projectEntity.getName());
        project.setVersion(projectEntity.getVersion());

        return project;
    }
}
