package pe.cronos.global.application.rest.addition.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class AdditionResponse {
    private BigDecimal result;
}
