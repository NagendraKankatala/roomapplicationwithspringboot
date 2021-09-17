package com.roomapplication.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rooms")
public class Room implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="serial_number")
	private Integer serialNumber;
	@Column(name="room_name")
	private String roomName;
	@Column(name="room_number")
	private Integer roomNumber;
	@Column(name="floor")
	private String floor;
	@Column(name="building")
	private String building;
	public Room() {
		// TODO Auto-generated constructor stub
	}
	public Room(Integer serialNumber, String roomName, Integer roomNumber, String floor, String building) {
		super();
		this.serialNumber = serialNumber;
		this.roomName = roomName;
		this.roomNumber = roomNumber;
		this.floor = floor;
		this.building = building;
	}
	@Override
	public String toString() {
		return "Room [serialNumber=" + serialNumber + ", roomName=" + roomName + ", roomNumber=" + roomNumber
				+ ", floor=" + floor + ", building=" + building + "]";
	}
	public Integer getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public Integer getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	
}
