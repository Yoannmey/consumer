package com.consumer;

import com.consumer.functional.Functional;
import com.consumer.restclient.RESTClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }


    @Bean
    public CommandLineRunner run(RESTClient restClient, Functional functional) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String call = scanner.nextLine();
            switch (call){
                case "restclient":
                    restClient.get();
                    restClient.post();
                    break;
                case "functional":
                    functional.testGet();
                    functional.testPost();
                    break;
                default:
                    break;
            }
        }
    }

}
