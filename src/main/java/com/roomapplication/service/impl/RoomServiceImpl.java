package com.roomapplication.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roomapplication.entity.Room;
import com.roomapplication.repo.RoomRepo;
import com.roomapplication.service.RoomService;

@Service
public class RoomServiceImpl implements RoomService {

	@Autowired
	private RoomRepo roomRepo;
	@Override
	public Room saveRoom(Room entity) {
		return roomRepo.save(entity);
	}

	@Override
	public List<Room> showAllRooms() {
		return roomRepo.findAll();
	}

	@Override
	public Room showRoomByNumber(Integer roomNumber) {
		return roomRepo.findbyRoomNumber(roomNumber);
	}

	@Override
	public Room updateRoom(Room entity) {
		return roomRepo.save(entity);
	}

	@Override
	public void deleteRoom(Integer roomNumber) {
		roomRepo.deleteByRoomNo(roomNumber);
	}

}
