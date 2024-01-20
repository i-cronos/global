package pe.cronos.global.domain.port.inbound;

import pe.cronos.global.domain.model.entity.Project;
import pe.cronos.global.domain.model.valuobject.ProjectId;

public interface GetProjectUseCase {

    Project apply(ProjectId projectId);

}
