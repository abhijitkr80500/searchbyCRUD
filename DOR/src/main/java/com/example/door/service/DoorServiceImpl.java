package com.example.door.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.door.entity.Door;
import com.example.door.repository.DoorRepository;

@Service
public class DoorServiceImpl implements DoorService{

	private DoorRepository doorRepository;
	
	
	
	public DoorServiceImpl(DoorRepository doorRepository) {
		super();
		this.doorRepository = doorRepository;
	}



	@Override
	public List<Door> getAllDoor() {
		
		List<Door> doorList = doorRepository.findAll();
		for(Door door:doorList)
		{
			if(door.isIsEnable())
			{
				door.setEntry("ENABLE");
			}
			else
			{
				door.setEntry("DISABLE");
			}
		}
		
		return doorList ;
	}



	@Override
	public Door saveDoor(Door door) {
		return doorRepository.save(door);
	}



	@Override
	public Door getDoorById(Long id) {
		
		return doorRepository.findById(id).get();
	}



	@Override
	public Door updateDoor(Door door) {
		
		return doorRepository.save(door);
	}



	@Override
	public void deleteDoorById(Long id) {
		doorRepository.deleteById(id);
		
	}
	

	
}
