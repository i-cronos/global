package pe.cronos.global.domain.port.outbound;

import pe.cronos.global.domain.model.entity.Project;
import pe.cronos.global.domain.model.valuobject.ProjectId;

public interface GetProjectOutPort {

    Project apply(ProjectId projectId);

}
