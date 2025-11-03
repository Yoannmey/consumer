package com.consumer.functional;

import org.openapitools.model.FindByEmail;
import org.openapitools.model.FindByGroup;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;

import java.util.List;

@HttpExchange
public interface FunctionalInterface {

    @GetExchange("/1.3/findSCORUserByGroup/aDGroup")
    List<FindByGroup> getResponseGet();

    @PostExchange("/1.3/findSCORUserByEMailAddress")
    List<FindByEmail> getResponsePost(@RequestBody String body);

}
