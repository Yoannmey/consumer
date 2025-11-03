package com.consumer.restclient;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import lombok.extern.slf4j.Slf4j;
import org.openapitools.model.FindByEmail;
import org.openapitools.model.FindByGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


@Component
@Slf4j
public class RESTClient {

    @Autowired
    private RestClient restClient;

    public void get() {

        ResponseEntity<List<FindByGroup>> response = restClient.get()
                .uri("1.3/findSCORUserByGroup/aDGroup")
                .retrieve()
                .toEntity(new ParameterizedTypeReference<>() {
                });

        for(FindByGroup i: response.getBody()){
            log.info(i.toString());

        }
    }

    public void post() {

        ResponseEntity<List<FindByEmail>> response = restClient.post()
        .uri("1.3/findSCORUserByEMailAddress")
        .body("""
               {"mail":"example@example.com"}
               """)
        .retrieve()
        .toEntity(new ParameterizedTypeReference<>() {
        });


        for(FindByEmail i: response.getBody()){
            log.info(i.toString());
        }

    }
}
