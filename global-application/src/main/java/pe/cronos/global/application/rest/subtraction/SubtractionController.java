package pe.cronos.global.application.rest.subtraction;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cronos.global.application.rest.subtraction.dto.SubtractionRequest;
import pe.cronos.global.application.rest.subtraction.dto.SubtractionResponse;
import pe.cronos.global.application.rest.subtraction.mapper.SubtractionDtoMapper;
import pe.cronos.global.domain.model.entity.Operand;
import pe.cronos.global.domain.model.valuobject.OperationResult;
import pe.cronos.global.domain.port.inbound.SubtractionUseCase;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/api/v1.0/subtraction")
public class SubtractionController {
    private final SubtractionUseCase subtractionUseCase;
    private final SubtractionDtoMapper subtractionDtoMapper;

    @PostMapping("/simple")
    public ResponseEntity<SubtractionResponse> subtract(@RequestBody SubtractionRequest subtractionRequest) {
        log.info("subtraction request: {}", subtractionRequest);
        Operand operand = subtractionDtoMapper.map(subtractionRequest);

        OperationResult operationResult = subtractionUseCase.apply(operand);
        SubtractionResponse subtractionResponse = subtractionDtoMapper.map(operationResult);

        log.info("subtraction response: {}", subtractionResponse);

        return ResponseEntity.ok(subtractionResponse);
    }
}
