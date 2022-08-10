package com.example.door.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Door")
public class Door {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
		
	//@NotEmpty
	@Column(name ="Door_Name") //, unique=true)
	private String DoorName;
	
	//@NotEmpty
	//@Size(max = 5 )
	@Column(name ="Area_Name")
	private String AreaName;
	
	@NotEmpty
	@Column(name ="Date")
	private String Date;
	
	//@NotEmpty
	@Column(name ="Is_Enable")
	private boolean IsEnable;
	
	
	private String entry;
	
	public String getEntry() {
		return entry;
	}
	public void setEntry(String entry) {
		this.entry = entry;
	}
	public Door() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Door(int id, String doorName, String areaName, String date, boolean isEnable) {
		super();
		this.id = id;
		DoorName = doorName;
		AreaName = areaName;
		Date = date;
		IsEnable = isEnable;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDoorName() {
		return DoorName;
	}
	public void setDoorName(String doorName) {
		DoorName = doorName;
	}
	public String getAreaName() {
		return AreaName;
	}
	public void setAreaName(String areaName) {
		AreaName = areaName;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public boolean isIsEnable() {
		return IsEnable;
	}
	public void setIsEnable(boolean isEnable) {
		IsEnable = isEnable;
	}
	

}
