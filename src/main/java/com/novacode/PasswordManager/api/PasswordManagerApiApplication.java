package com.novacode.PasswordManager.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class PasswordManagerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PasswordManagerApiApplication.class, args);
	}

}
