package com.kylin.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class KylinApplication {

    public static void main(String[] args) {
        SpringApplication.run(KylinApplication.class, args);
    }
}
