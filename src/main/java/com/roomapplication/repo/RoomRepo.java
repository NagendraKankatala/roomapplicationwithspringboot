package com.roomapplication.repo;

import java.io.Serializable;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.roomapplication.entity.Room;

@Repository
public interface RoomRepo extends JpaRepository<Room, Serializable> {

	   @Query(value="select * from rooms R  where R.room_number=:room_no",nativeQuery =true)
	   Room findbyRoomNumber(Integer room_no);
	   
		
	   
	   //deleteByRoomNo
	   
	   @Modifying
	   @Transactional
	   @Query(value = "DELETE FROM rooms  R where R.room_number =:room_no ", nativeQuery = true)
	   void deleteByRoomNo(Integer room_no);
}
