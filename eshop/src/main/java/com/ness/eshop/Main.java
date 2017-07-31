package com.ness.eshop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ness.eshop.mapper.MapperDTOtoSupplier;
import com.ness.eshop.mapper.MapperDTOtoUser;
import com.ness.eshop.mapper.MapperSupplierToDTO;
import com.ness.eshop.mapper.MapperUserToDTO;
import com.ness.eshop.service.UserService;
import com.ness.eshop.service.UserServiceImp;

@Configuration
@SpringBootApplication
public class Main {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Main.class, args);
	}

	@Bean
	public CommandLineRunner runner(ConsoleUi ui) {
		return args -> ui.run();
	}

	@Bean
	public ConsoleUi consoleUI() {
		return new ConsoleUi();
	}

	@Bean
	public MapperDTOtoUser mapperDTOtoUser() {
		return new MapperDTOtoUser();
	}

	@Bean
	public MapperUserToDTO MapperUserToDTO() {
		return new MapperUserToDTO();

	}

	@Bean
	public MapperSupplierToDTO mapperSupplierToDTO() {
		return new MapperSupplierToDTO();
	}

	@Bean
	public MapperDTOtoSupplier mapperDTOtoSupplier() {
		return new MapperDTOtoSupplier();

	}

	@Bean
	public UserService userService() {
		return new UserServiceImp();
	}

}
