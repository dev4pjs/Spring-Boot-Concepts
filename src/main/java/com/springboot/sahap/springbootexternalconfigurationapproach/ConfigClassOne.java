package com.springboot.sahap.springbootexternalconfigurationapproach;


import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

import java.util.Arrays;
import java.util.List;

@ImportResource(value="classpath:context.properties", reader= PropertiesBeanDefinitionReader.class)  // way to import bean from external property file
public class ConfigClassOne {

    @Bean
    public List<String> cats(){
        return Arrays.asList("Cat","Tiger");
    }
}
