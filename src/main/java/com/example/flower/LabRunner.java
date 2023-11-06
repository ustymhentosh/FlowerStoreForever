package com.example.flower;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class LabRunner {
    public static void main(String[] args) {
        SpringApplication.run(LabRunner.class, args);
    }
}
