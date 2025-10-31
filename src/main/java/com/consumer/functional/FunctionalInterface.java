package com.consumer.functional;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;

@HttpExchange
public interface FunctionalInterface {

    @GetExchange("/1.3/findSCORUserByGroup/aDGroup")
    String getResponseGet();

    @PostExchange("/1.3/findSCORUserByEMailAddress")
    String getResponsePost(@RequestBody String body);

}
