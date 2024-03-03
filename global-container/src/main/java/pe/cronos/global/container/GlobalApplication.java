package pe.cronos.global.container;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(
        basePackages = {
                "pe.cronos.global.container",
                "pe.cronos.global.application",
                "pe.cronos.global.domain",
                "pe.cronos.global.infrastructure"
        }
)
@EnableAutoConfiguration
public class GlobalApplication {

    public static void main(String[] args) {
        SpringApplication.run(GlobalApplication.class, args);
    }
}
