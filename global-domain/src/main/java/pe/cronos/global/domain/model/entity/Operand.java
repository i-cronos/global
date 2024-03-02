package pe.cronos.global.domain.model.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Operand {
    private Integer scale;
    private BigDecimal operandA;
    private BigDecimal operandB;
}
