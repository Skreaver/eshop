package com.ness.eshop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;





@Configuration
@SpringBootApplication
public class Main {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Main.class, args);
	}
	
	@Bean
	public CommandLineRunner runner(ConsoleUI ui) { return args ->ui.run(); }

	@Bean
	public ConsoleUI consoleUI() {
		return new ConsoleUI();
	}
	
	
}
