package flower;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LabRunner {
    public static void main(String[] args) {
        SpringApplication.run(LabRunner.class, args);
    }
}
