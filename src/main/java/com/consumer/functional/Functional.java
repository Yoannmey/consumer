package com.consumer.functional;


import lombok.extern.slf4j.Slf4j;
import org.openapitools.model.FindByEmail;
import org.openapitools.model.FindByGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class Functional {

    @Autowired
    FunctionalInterface test;

    @Autowired
    private String token;

    public List<FindByGroup> get(){
         return test.getResponseGet();
    }

    public List<FindByEmail> post(){
        return test.getResponsePost("""
                {"email":"example@example.com"}
                """
        );
    }

}