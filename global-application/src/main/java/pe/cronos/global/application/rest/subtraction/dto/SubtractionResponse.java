package pe.cronos.global.application.rest.subtraction.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
public class SubtractionResponse {
    private BigDecimal result;
}
