package pe.cronos.global.domain.model.valuobject;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class OperationResult {
    private BigDecimal result;
}
