package com.consumer;

import com.consumer.functional.Functional;
import com.consumer.restclient.RESTClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }


    @Bean
    public CommandLineRunner run(RESTClient restClient, Functional functional) {
        return args -> {
            functional.get();
            functional.post();
        };
    }
}
