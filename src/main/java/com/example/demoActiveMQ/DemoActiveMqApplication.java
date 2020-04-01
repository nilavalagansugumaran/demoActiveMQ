package com.example.demoActiveMQ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoActiveMqApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DemoActiveMqApplication.class, args);

		context.getBean(MySenderComponent.class).sendSimpleMessage("Hello there...");
	}

}
