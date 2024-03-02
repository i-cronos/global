package pe.cronos.global.application.rest.addition.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
public class AdditionRequest {
    private Integer scale;
    private BigDecimal a;
    private BigDecimal b;
}
