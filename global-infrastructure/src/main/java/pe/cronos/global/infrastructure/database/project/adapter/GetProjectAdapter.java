package pe.cronos.global.infrastructure.database.project.adapter;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import pe.cronos.global.domain.model.entity.Project;
import pe.cronos.global.domain.model.valuobject.ProjectId;
import pe.cronos.global.domain.port.outbound.GetProjectOutPort;
import pe.cronos.global.infrastructure.database.project.adapter.mapper.ProjectEntityMapper;
import pe.cronos.global.infrastructure.database.project.entity.ProjectEntity;
import pe.cronos.global.infrastructure.database.project.repository.ProjectRepository;

@Component
@AllArgsConstructor
public class GetProjectAdapter implements GetProjectOutPort {

    private final ProjectRepository projectRepository;
    private final ProjectEntityMapper projectMapper;

    @Override
    public Project apply(ProjectId projectId) {
        ProjectEntity projectEntity = projectRepository.getProjectInfo();

        return projectMapper.map(projectEntity);
    }
}
