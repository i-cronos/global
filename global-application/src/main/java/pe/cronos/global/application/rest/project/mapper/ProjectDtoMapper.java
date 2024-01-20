package pe.cronos.global.application.rest.project.mapper;

import org.springframework.stereotype.Component;
import pe.cronos.global.application.rest.project.dto.ProjectResponse;
import pe.cronos.global.domain.model.entity.Project;

import java.time.ZonedDateTime;

@Component
public class ProjectDtoMapper {

    public ProjectResponse map(Project project) {
        ProjectResponse projectResponse = new ProjectResponse();
        projectResponse.setName(project.getName());
        projectResponse.setVersion(project.getVersion());
        projectResponse.setCurrent(ZonedDateTime.now().toString());

        return projectResponse;
    }
}
