package pl.favael.jenkinsspringexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsSpringExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsSpringExampleApplication.class, args);
    }

    @GetMapping("/job")
    public String get() {
        return "Good job Raf!";

    }

}
