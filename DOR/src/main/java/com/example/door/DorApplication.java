package com.example.door;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.door.entity.Door;
import com.example.door.repository.DoorRepository;

@SpringBootApplication
public class DorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DorApplication.class, args);
	
	
	}
	
}
