package com.consumer.restclient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
@Slf4j
public class RESTClient {

    public void get(){

        RestClient restClient = RestClient.create();

        ResponseEntity<String> response = restClient.get()
                .uri("http://localhost:8080/scor-ref-user-presentation/api/testGet")
                .header("Content-Type", "application/json")
                .retrieve()
                .toEntity(String.class);

        log.info(String.valueOf(response.getBody()));
    }

    public void post(){

        RestClient restClient = RestClient.create();
        String body = """
                a
                """;
        ResponseEntity<String> response = restClient.post()
                .uri("http://localhost:8080/scor-ref-user-presentation/api/testPost")
                .header("Content-Type","application/json")
                .body(body)
                .retrieve()
                .toEntity(String.class);

        log.info(String.valueOf(response.getBody()));
    }
}
