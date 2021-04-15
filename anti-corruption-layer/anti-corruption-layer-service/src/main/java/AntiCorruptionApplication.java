import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Inventory Application starts container (Spring Boot) and exposes the Inventory micro-service.
 */
@SpringBootApplication
public class AntiCorruptionLayerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AntiCorruptionLayerApplication.class, args);
    }


    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
