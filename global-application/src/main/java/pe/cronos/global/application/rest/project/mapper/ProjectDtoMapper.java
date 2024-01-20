package pe.cronos.global.application.rest.project.mapper;

import lombok.AllArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import pe.cronos.global.application.rest.project.dto.ProjectResponse;
import pe.cronos.global.domain.model.entity.Project;

import java.time.ZonedDateTime;
import java.util.Arrays;

@Component
@AllArgsConstructor
public class ProjectDtoMapper {
    private final Environment environment;

    public ProjectResponse map(Project project) {
        ProjectResponse projectResponse = new ProjectResponse();
        projectResponse.setName(project.getName());
        projectResponse.setVersion(project.getVersion());
        projectResponse.setCurrent(ZonedDateTime.now().toString());
        projectResponse.setProfile(Arrays.stream(environment.getActiveProfiles()).findFirst().orElse("None"));
        return projectResponse;
    }
}
