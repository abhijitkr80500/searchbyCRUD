package com.example.door.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.door.entity.Door;
import com.example.door.service.DoorService;

@Controller
public class DoorController {
	
	private DoorService doorService;

	public DoorController(DoorService doorService) {
		super();
		this.doorService = doorService;
	}
	
	
	@GetMapping("/doors")
	public String listDoors(Model model)
	{
		List<Door> doorList =doorService.getAllDoor();
		model.addAttribute("doors",doorList);
		return "doors";
	}
	
	
	@GetMapping("/doors/new")
	public String createdoorForm(Model model)
	{
		Door door = new Door();
		model.addAttribute("door", door);
		return "create_door";
	}
	
	
	@PostMapping("/doors")
	public String saveDoor(@ModelAttribute ("door")Door door) {
		
		doorService.saveDoor(door);
		return "redirect:/doors";
		
	}
	
	
	@GetMapping("/doors/edit/{id}")
	public String editStudentForm(@PathVariable Long id,Model model) {
		
		model.addAttribute("door", doorService.getDoorById(id));
		return "edit_door";
	}
	
	
	@PostMapping("/doors/{id}")
	public String updateDoor(@PathVariable Long id,
			@ModelAttribute ("door")Door door,
			Model model) {
		
		//get door details from DB
		Door existingDoor= doorService.getDoorById(id);
		
		existingDoor.setId(id);
		existingDoor.setDoorName(door.getDoorName());
		existingDoor.setAreaName(door.getAreaName());
		existingDoor.setDate(door.getDate());
		existingDoor.setIsEnable(door.isIsEnable());
		
		
		//save updated details
		doorService.updateDoor(existingDoor);
		return "redirect:/doors";
		
	}
	
	@GetMapping("/doors/{id}")
	public String deleteDoor(@PathVariable Long id)
	{
		doorService.deleteDoorById(id);
		return "redirect:/doors";
	}
	


}








