package com.springboot.sahap.springbootexternalconfigurationapproach;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import java.util.Arrays;
import java.util.List;

@Configuration
@ImportResource({"context1.xml","context2.xml"}) \\ way to importing external xml configuration file, where other beans has been defined
public class ConfigClassTwo {

    @Bean
    public List<String> dogs(){
        return Arrays.asList("Dog","Hayna");
    }
}
