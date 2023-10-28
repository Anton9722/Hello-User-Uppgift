package com.HelloUser.HelloUser;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloUserApplication {

	public static List<Members> membersList = new ArrayList<>();
	static{
		membersList.add(new Members("Kalle", "Kalle@hotmail.com", 32));
		membersList.add(new Members("Lisa", "Lisa@gmail.com", 29));
		membersList.add(new Members("Hannes", "Hannes@hotmail.com", 40));
	}
	public static void main(String[] args) {
		SpringApplication.run(HelloUserApplication.class, args);
	}

}
