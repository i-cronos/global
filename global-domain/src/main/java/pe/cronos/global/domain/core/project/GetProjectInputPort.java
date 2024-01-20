package pe.cronos.global.domain.core.project;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import pe.cronos.global.domain.model.entity.Project;
import pe.cronos.global.domain.model.valuobject.ProjectId;
import pe.cronos.global.domain.port.inbound.GetProjectUseCase;
import pe.cronos.global.domain.port.outbound.GetProjectOutPort;

@Component
@AllArgsConstructor
public class GetProjectInputPort implements GetProjectUseCase {
    private final GetProjectOutPort getProjectOutPort;

    @Override
    public Project apply(ProjectId projectId) {

        return getProjectOutPort.apply(projectId);
    }
}
