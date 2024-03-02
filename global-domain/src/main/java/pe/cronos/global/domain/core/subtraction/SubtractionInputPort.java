package pe.cronos.global.domain.core.subtraction;

import org.springframework.stereotype.Component;
import pe.cronos.global.domain.model.entity.Operand;
import pe.cronos.global.domain.model.valuobject.OperationResult;
import pe.cronos.global.domain.port.inbound.SubtractionUseCase;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Component
public class SubtractionInputPort implements SubtractionUseCase {
    private static final int DEFAULT_SCALE = 2;

    @Override
    public OperationResult apply(Operand operand) {
        if (operand.getScale() == null)
            operand.setScale(DEFAULT_SCALE);

        BigDecimal result = operand.getOperandA()
                .subtract(operand.getOperandB())
                .setScale(operand.getScale(), RoundingMode.HALF_UP);

        return new OperationResult(result);
    }
}
