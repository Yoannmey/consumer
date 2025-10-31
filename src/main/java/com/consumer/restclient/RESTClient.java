package com.consumer.restclient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import java.io.IOException;

@Component
@Slf4j
public class RESTClient {

    @Autowired
    private RestClient restClient;

    public void get() throws IOException, InterruptedException {

        ResponseEntity<String> response = restClient.get()
                .uri("1.3/findSCORUserByGroup/aDGroup")
                .retrieve()
                .toEntity(String.class);

        log.info(String.valueOf(response.getBody()));
    }

    public void post() throws IOException, InterruptedException {

        ResponseEntity<String> response = restClient.post()
                .uri("1.3/findSCORUserByEMailAddress")
                .body("""
                       {"mail":"example@example.com"}
                       """)
                .retrieve()
                .toEntity(String.class);

        log.info(String.valueOf(response.getBody()));
    }
}
