package pe.cronos.global.container;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DataLoader implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        log.info("[step 1] Start data loader");
        log.info("[step 2] Pull data from gcp");
        simulate(30);
        log.info("[step 3] Encrypt data");
        simulate(30);
        log.info("[step 4] Push data to azure");
        simulate(40);
        log.info("[step 5] Send notification");
        simulate(20);
        log.info("[step 6] Data loader finished");
        System.exit(0);

    }

    private void simulate(int timeSeconds) {
        try {
            Thread.sleep(1000 * timeSeconds);
        } catch (InterruptedException ex) {
            log.error("Data loader error : {}", ex.getMessage());
        }
    }

}
