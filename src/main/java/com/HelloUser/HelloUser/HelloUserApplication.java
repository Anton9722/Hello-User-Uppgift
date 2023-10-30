package com.HelloUser.HelloUser;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloUserApplication {

	public static List<Members> membersList = new ArrayList<>();
	static{
		membersList.add(new Members("Kalle", "Kalle@hotmail.com"));
		membersList.add(new Members("Lisa", "Lisa@gmail.com"));
		membersList.add(new Members("Hannes", "Hannes@hotmail.com"));
	}
	public static void main(String[] args) {
		SpringApplication.run(HelloUserApplication.class, args);
	}

}
