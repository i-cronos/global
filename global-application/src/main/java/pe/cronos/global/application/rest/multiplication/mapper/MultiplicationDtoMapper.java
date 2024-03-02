package pe.cronos.global.application.rest.multiplication.mapper;

import org.springframework.stereotype.Component;
import pe.cronos.global.application.rest.multiplication.dto.MultiplicationRequest;
import pe.cronos.global.application.rest.multiplication.dto.MultiplicationResponse;
import pe.cronos.global.domain.model.entity.Operand;
import pe.cronos.global.domain.model.valuobject.OperationResult;

@Component
public class MultiplicationDtoMapper {

    public Operand map(MultiplicationRequest multiplicationRequest) {
        Operand operand = new Operand();
        operand.setScale(multiplicationRequest.getScale());
        operand.setOperandA(multiplicationRequest.getA());
        operand.setOperandB(multiplicationRequest.getB());

        return operand;
    }

    public MultiplicationResponse map(OperationResult operationResult) {
        MultiplicationResponse multiplicationResponse = new MultiplicationResponse();
        multiplicationResponse.setResult(operationResult.getResult());

        return multiplicationResponse;
    }
}
