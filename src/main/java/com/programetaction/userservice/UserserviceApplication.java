package com.programetaction.userservice;

import com.programetaction.userservice.domain.Role;
import com.programetaction.userservice.domain.User;
import com.programetaction.userservice.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

/**
 * @author JOSEPH WATZSON alias Joe Watson SBF (https://www.instagram.com/joe_watson_sbf)
 * @version 1.0
 * @since 27/07/2021
 * */

@SpringBootApplication
public class UserserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserserviceApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}

	/*
	@Bean
	CommandLineRunner run(UserService service){
		return args -> {
			service.saveRole(new Role(null, "ROLE_USER"));
			service.saveRole(new Role(null, "ROLE_MANAGER"));
			service.saveRole(new Role(null, "ROLE_ADMIN"));
			service.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

			service.saveUser(new User(null, "Joe Watson SBF", "joe", "1234", new ArrayList<>()));
			service.saveUser(new User(null, "Diorkens", "dior", "12345", new ArrayList<>()));
			service.saveUser(new User(null, "Love Djina", "love", "12346", new ArrayList<>()));
			service.saveUser(new User(null, "James K-dozo", "k-do", "12347", new ArrayList<>()));
			service.saveUser(new User(null, "Cardy", "cardy", "12348", new ArrayList<>()));

			service.addRoleToUser("joe", "ROLE_SUPER_ADMIN");
			service.addRoleToUser("dior", "ROLE_ADMIN");
			service.addRoleToUser("love", "ROLE_MANAGER");
			service.addRoleToUser("james", "ROLE_USER");
			service.addRoleToUser("cardy", "ROLE_USER");

		};
	} */

}
