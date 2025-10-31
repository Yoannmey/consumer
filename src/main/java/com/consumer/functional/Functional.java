package com.consumer.functional;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Functional {

    @Autowired
    FunctionalInterface test;

    @Autowired
    private String token;

    public String get(){
         return test.getResponseGet();
    }

    public String post(){
        return test.getResponsePost("""
                {"email":"example@example.com"}
                """
        );
    }

}