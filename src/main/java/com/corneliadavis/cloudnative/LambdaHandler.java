package com.corneliadavis.cloudnative;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by cdavis on 4/23/17.
 */
public class LambdaHandler {

    private static ApplicationContext springContext = null;
    private SayHello sayHello;

    public String LambdaHandler (String who) {

        springContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        sayHello = springContext.getBean(SayHello.class);
        return sayHello.hello(who);
    }
}
