package com.consumer;

import com.consumer.functional.Functional;
import com.consumer.json.Json;
import com.consumer.restclient.RESTClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }


    @Bean
    public CommandLineRunner run(Json json, Functional functional) {
        return args -> {
            json.generateClass(json.toJson(functional.post()));
        };
    }
}
