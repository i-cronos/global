package pe.cronos.global.application.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/")
public class HealthController {

    @GetMapping("live")
    public ResponseEntity<String> liveness() {
        log.info("Check health, live!");
        return ResponseEntity.ok("live!");
    }

    @GetMapping("ready")
    public ResponseEntity<String> readiness() {
        log.info("Check health, ready!");
        return ResponseEntity.ok("ready!");
    }
}
