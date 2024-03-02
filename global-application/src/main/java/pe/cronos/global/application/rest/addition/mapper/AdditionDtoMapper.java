package pe.cronos.global.application.rest.addition.mapper;

import org.springframework.stereotype.Component;
import pe.cronos.global.application.rest.addition.dto.AdditionRequest;
import pe.cronos.global.application.rest.addition.dto.AdditionResponse;
import pe.cronos.global.domain.model.entity.Operand;
import pe.cronos.global.domain.model.valuobject.OperationResult;

@Component
public class AdditionDtoMapper {

    public Operand map(AdditionRequest additionRequest) {
        Operand operand = new Operand();
        operand.setScale(additionRequest.getScale());
        operand.setOperandA(additionRequest.getA());
        operand.setOperandB(additionRequest.getB());

        return operand;
    }

    public AdditionResponse map(OperationResult operationResult) {
        AdditionResponse additionResponse = new AdditionResponse();
        additionResponse.setResult(operationResult.getResult());

        return additionResponse;
    }
}
