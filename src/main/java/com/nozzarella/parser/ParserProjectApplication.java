package com.nozzarella.parser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.nozzarella.parser","com.nozzarella.controllers"})
public class ParserProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParserProjectApplication.class, args);
	}

}
