package com.HelloUser.HelloUser;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloUserApplication {

	public static List<Members> membersList = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(HelloUserApplication.class, args);
	}

}
