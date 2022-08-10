package io.hotel.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.hotel.dao.RoomDao;
import io.hotel.excption.RoomException;
import io.hotel.model.Room;
@Service
public class RoomServiceImpl implements RoomService{
	
	@Autowired
	RoomDao daoRoom;

	@Override
	public Collection<Room> getAllRooms() {
		// TODO Auto-generated method stub
		return daoRoom.findAll();
	}

	@Override
	public Optional<Room> getRoom(String roomNo) {
		// TODO Auto-generated method stub
		Optional<Room> room = daoRoom.findById(roomNo);
		if (!room.isPresent()) {
			throw new RoomException("Room not found");
		}
		return room;
	}

	@Override
	public String createRoom(Room room) {
		// TODO Auto-generated method stub
		daoRoom.insert(room);
		return ("Added with id"+ room.getroomNo());
	}

	@Override
	public String updateRoom(String roomNo, Room room) {
		// TODO Auto-generated method stub
		daoRoom.save(room);
		return("Updated with roomNo"+roomNo);
	}

	@Override
	public String deleteRoom(String roomNo) {
		// TODO Auto-generated method stub
		daoRoom.deleteById(roomNo);
		return("Delete with roomNo"+roomNo);
	}

}
