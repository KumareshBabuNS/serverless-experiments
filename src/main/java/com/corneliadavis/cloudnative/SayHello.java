package com.corneliadavis.cloudnative;
/**
 * Created by cdavis on 4/9/17.
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SayHello {

    @Value("${greeting}")
    String greeting;

    public String hello (String who) {

        if (who == "") throw new RuntimeException("unauthorized");
        String compositeGreeting = greeting + " " + who;
        System.out.println(compositeGreeting);
        return compositeGreeting;
    }
}
