package com.consumer;

import com.consumer.functional.FunctionalInterface;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Configuration
@Slf4j
public class Config {

    @Value("${client.id}")
    private String clientId;

    @Value("${client.secret}")
    private String clientSecret;

    @Value("${scope}")
    private String scope;

    @Value("${grant.type}")
    private String grantType;

    @Value("${token.url}")
    private String tokenUrl;

    @Value("${base.url}")
    private String baseUrl;

    @Bean
    public RestClient restClient() throws IOException, InterruptedException {
        return RestClient.builder()
                .baseUrl(baseUrl)
                .defaultHeader("Authorization", token())
                .defaultHeader("Content-Type", "application/json")
                .build();
    }

    @Bean
    public String token() throws IOException, InterruptedException {

        String body = "response_type=token&client_id=" + clientId + "&client_secret=" + clientSecret + "&scope=" + scope + "&grant_type=" + grantType;

        HttpRequest request = HttpRequest.newBuilder().POST(HttpRequest.BodyPublishers.ofString(body)).uri(URI.create(tokenUrl))
                .build();

        String response = HttpClient.newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString()).body();

        JsonObject convertedObject = new Gson().fromJson(response, JsonObject.class);

        String str = String.valueOf(convertedObject.get("access_token"));

        str = str.substring(1);

        str = str.substring(0, str.length() -1);

        return "Bearer " + str;
    }

    @Bean
    FunctionalInterface proxy(RestClient restClient) {
        HttpServiceProxyFactory httpServiceProxyFactory =
                HttpServiceProxyFactory.builderFor(RestClientAdapter.create(restClient))
                        .build();
        return httpServiceProxyFactory.createClient(FunctionalInterface.class);
    }
}
