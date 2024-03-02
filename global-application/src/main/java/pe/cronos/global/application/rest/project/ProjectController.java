package pe.cronos.global.application.rest.project;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cronos.global.application.rest.project.dto.ProjectResponse;
import pe.cronos.global.application.rest.project.mapper.ProjectDtoMapper;
import pe.cronos.global.domain.model.entity.Project;
import pe.cronos.global.domain.model.valuobject.ProjectId;
import pe.cronos.global.domain.port.inbound.GetProjectUseCase;

import java.util.UUID;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/api/v1.0/project")
public class ProjectController {

    private final ProjectDtoMapper projectDtoMapper;
    private final GetProjectUseCase getProjectUseCase;

    @GetMapping
    public ResponseEntity<ProjectResponse> getProjectInfo() {
        log.info("get Project info!");
        Project project = getProjectUseCase.apply(new ProjectId(UUID.randomUUID().toString()));
        ProjectResponse response = projectDtoMapper.map(project);
        return ResponseEntity.ok(response);
    }
}
