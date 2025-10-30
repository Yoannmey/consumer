package com.consumer.functional;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Component
@Slf4j
public class Functional {

    @FunctionalInterface
    interface Call {
        void request(String url) throws Exception;
    }

    public void testGet() throws Exception {
        Call test = (url) -> {
            HttpRequest request = HttpRequest.newBuilder().GET()
                    .uri(URI.create(url))
                    .build();
            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

             log.info(response.body());
        };

        test.request("http://localhost:8080/scor-ref-user-presentation/api/testGet");
    }

    public void testPost() throws Exception {

        Call test = (url) -> log.info(
                 HttpClient.newHttpClient()
                        .send(HttpRequest.newBuilder()
                                .POST(HttpRequest.BodyPublishers.ofString("body"))
                                .uri(URI.create(url))
                                .build(), HttpResponse.BodyHandlers.ofString()).body());

        test.request("http://localhost:8080/scor-ref-user-presentation/api/testPost");
    }
}
