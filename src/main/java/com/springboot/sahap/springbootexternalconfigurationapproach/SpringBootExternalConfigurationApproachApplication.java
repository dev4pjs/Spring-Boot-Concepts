package com.springboot.sahap.springbootexternalconfigurationapproach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@Import(ConfigClassOne.class)
public class SpringBootExternalConfigurationApproachApplication {

	@Autowired
	private BeanA beanA;

	@Autowired
	private  BeanB beanB;

	@Autowired
	private BeanC beanC;


	@Autowired // One way of injecting a Bean using import class
	private List<String> cats;


	@Autowired //Traditional way to inject bean using @Configuration on top of the bean class
	private List<String> dogs;

	@GetMapping("/msg")
	public String getMessage(){
		return "Hello World! => "+cats.toString()+" dogs =>"+dogs.toString()+" BeanA =>"+beanA.getMessage()+" BeanB =>"+beanB.getMessage()+" BeanC =>"+beanC.getMessage();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExternalConfigurationApproachApplication.class, args);
	}
}
