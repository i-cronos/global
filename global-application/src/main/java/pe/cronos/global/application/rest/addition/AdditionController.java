package pe.cronos.global.application.rest.addition;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cronos.global.application.rest.addition.dto.AdditionRequest;
import pe.cronos.global.application.rest.addition.dto.AdditionResponse;
import pe.cronos.global.application.rest.addition.mapper.AdditionDtoMapper;
import pe.cronos.global.domain.model.entity.Operand;
import pe.cronos.global.domain.model.valuobject.OperationResult;
import pe.cronos.global.domain.port.inbound.AdditionUseCase;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/api/v1.0/addition")
public class AdditionController {
    private final AdditionUseCase additionUseCase;
    private final AdditionDtoMapper additionDtoMapper;

    @PostMapping("/simple")
    public ResponseEntity<AdditionResponse> add(@RequestBody AdditionRequest additionRequest) {
        Operand operand = additionDtoMapper.map(additionRequest);

        OperationResult operationResult = additionUseCase.apply(operand);

        return ResponseEntity.ok(additionDtoMapper.map(operationResult));
    }
}
