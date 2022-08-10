package com.example.door.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.door.entity.Door;

public interface DoorRepository  extends JpaRepository<Door, Long>{

//@Query("From Door where id>=?1 and id<=?2 ")
//List<Door> fetchDoorByIdRange(int min,int max);

//@Query("From door WHERE id>=:min and id<=:max")
//List<Door> fetchDoorByIdRange(int min,int max);

}
