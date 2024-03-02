package pe.cronos.global.application.rest.multiplication;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cronos.global.application.rest.multiplication.dto.MultiplicationRequest;
import pe.cronos.global.application.rest.multiplication.dto.MultiplicationResponse;
import pe.cronos.global.application.rest.multiplication.mapper.MultiplicationDtoMapper;
import pe.cronos.global.domain.model.entity.Operand;
import pe.cronos.global.domain.model.valuobject.OperationResult;
import pe.cronos.global.domain.port.inbound.MultiplicationUseCase;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/api/v1.0/multiplication")
public class MultiplicationController {
    private final MultiplicationUseCase multiplicationUseCase;
    private final MultiplicationDtoMapper multiplicationDtoMapper;

    @PostMapping("/simple")
    public ResponseEntity<MultiplicationResponse> multiply(@RequestBody MultiplicationRequest multiplicationRequest) {
        log.info("multiplication request: {}", multiplicationRequest);
        Operand operand = multiplicationDtoMapper.map(multiplicationRequest);

        OperationResult operationResult = multiplicationUseCase.apply(operand);
        MultiplicationResponse multiplicationResponse = multiplicationDtoMapper.map(operationResult);

        log.info("multiplication response: {}", multiplicationResponse);

        return ResponseEntity.ok(multiplicationResponse);
    }
}
