package com.corneliadavis.cloudnative;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by cdavis on 4/23/17.
 */
@Configuration
@ComponentScan("com.corneliadavis.cloudnative")
@PropertySource("classpath:application.properties")
public class SpringConfig {

}
