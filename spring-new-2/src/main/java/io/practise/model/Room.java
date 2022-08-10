package io.practise.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="Room")
public class Room {
	
	@Id
	private String roomNo;
	private String floor;
	private String type;
	private Boolean occupied;
	private String guestName;
	private String noOfGuest;
	
	public Room() {}
	
	public Room(String roomNo,String floor,String type,Boolean occupied,String guestName,String noOfGuest) {
		super();
		this.roomNo=roomNo;
		this.floor=floor;
		this.type=type;
		this.occupied=occupied;
		this.guestName=guestName;
		this.noOfGuest=noOfGuest;
	}
	
	public String getroomNo() {
		return roomNo;
	}
	public void setroomNo(String roomNo) {
		this.roomNo=roomNo;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getOccupied() {
		return occupied;
	}

	public void setOccupied(Boolean occupied) {
		this.occupied = occupied;
	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public String getNoOfGuest() {
		return noOfGuest;
	}

	public void setNoOfGuest(String noOfGuest) {
		this.noOfGuest = noOfGuest;
	}
	


}
