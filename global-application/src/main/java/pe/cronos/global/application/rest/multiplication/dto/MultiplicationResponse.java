package pe.cronos.global.application.rest.multiplication.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
public class MultiplicationResponse {
    private BigDecimal result;
}
