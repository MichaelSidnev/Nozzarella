package com.nozzarella;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.nozzarella.controllers", "com.nozzarella.domain", "com.nozzarella.parser", "com.nozzarella.repository"})
public class ParserProjectApplication {

	public static void main(String... args) {
		SpringApplication.run(ParserProjectApplication.class, args);
	}

}
