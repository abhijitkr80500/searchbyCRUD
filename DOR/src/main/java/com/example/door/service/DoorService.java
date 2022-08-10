package com.example.door.service;

import java.util.List;

import com.example.door.entity.Door;
import com.example.door.repository.DoorRepository;

public interface DoorService {
	
	List<Door> getAllDoor();
	
	Door saveDoor(Door door);
	
	
	Door getDoorById(Long id);
	
	Door updateDoor(Door door);
	
	void deleteDoorById(Long id);
	
	//public void test(DoorRepository dr);
	

}
