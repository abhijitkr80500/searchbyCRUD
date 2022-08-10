package com.example.door;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.example.door.entity.Door;
import com.example.door.repository.DoorRepository;


@Component
public class InputRunner implements CommandLineRunner{
	
	
	@Autowired
	private DoorRepository doorRepository; 
	
	@Override
	public void run(String... args) throws Exception {
//		Door door5 = new Door(5, "Door5", "Area5", "01/02/2022", false);
//		doorRepository.save(door5);
//		
//		Door door6 = new Door(6, "Door6", "Area6", "01/02/2012", false);
//	     doorRepository.save(door6);
//		
//		Door door7 = new Door(7, "Door7", "Area7", "01/02/2102", true);
//		doorRepository.save(door7);
		
		
		//doorRepository.findAll().forEach(System.out::println);
		
		//doorRepository.fetchDoorByIdRange(2,5).forEach(System.out::println);
	}

}
