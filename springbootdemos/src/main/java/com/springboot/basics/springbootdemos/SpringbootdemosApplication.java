package com.springboot.basics.springbootdemos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootdemosApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext appContext = SpringApplication.run(SpringbootdemosApplication.class, args);
		for (String name : appContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}

}
