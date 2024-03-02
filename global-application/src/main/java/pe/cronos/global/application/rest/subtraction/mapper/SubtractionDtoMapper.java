package pe.cronos.global.application.rest.subtraction.mapper;

import org.springframework.stereotype.Component;
import pe.cronos.global.application.rest.subtraction.dto.SubtractionRequest;
import pe.cronos.global.application.rest.subtraction.dto.SubtractionResponse;
import pe.cronos.global.domain.model.entity.Operand;
import pe.cronos.global.domain.model.valuobject.OperationResult;

@Component
public class SubtractionDtoMapper {

    public Operand map(SubtractionRequest subtractionRequest) {
        Operand operand = new Operand();
        operand.setScale(subtractionRequest.getScale());
        operand.setOperandA(subtractionRequest.getA());
        operand.setOperandB(subtractionRequest.getB());

        return operand;
    }

    public SubtractionResponse map(OperationResult operationResult) {
        SubtractionResponse subtractionResponse = new SubtractionResponse();
        subtractionResponse.setResult(operationResult.getResult());

        return subtractionResponse;
    }
}
