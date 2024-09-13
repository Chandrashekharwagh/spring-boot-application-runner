package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApplicationRunnerExample {
    private static final Logger logger = LoggerFactory.getLogger(ApplicationRunnerExample.class);

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRunnerExample.class, args);
    }

    @Bean
    public ApplicationRunner applicationRunner() {
        return args -> {
            logger.info("ApplicationRunner executed with arguments: {}", args.getOptionNames());
            // Custom startup logic here
        };
    }
}
