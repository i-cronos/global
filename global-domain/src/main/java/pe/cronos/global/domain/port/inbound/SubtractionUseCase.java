package pe.cronos.global.domain.port.inbound;

import pe.cronos.global.domain.model.entity.Operand;
import pe.cronos.global.domain.model.valuobject.OperationResult;

public interface SubtractionUseCase {

    OperationResult apply(Operand operand);

}
