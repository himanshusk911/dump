package io.hotel.controller;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.hotel.model.Room;
import io.hotel.service.RoomService;


@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/room")
public class RoomController {
	

	@Autowired
	RoomService roomResc;
	
	@RequestMapping("/room1")
	public String home() {
		return ("Welcome ");
	}
	

	@RequestMapping("/roominfo")
	public Collection<Room> getAllRooms(){
		return roomResc. getAllRooms();
	}

	@GetMapping("/roominfo/{roomNo}")
	public  Optional<Room> getRoom(@PathVariable String roomNo){
		return roomResc.getRoom(roomNo);
	}
	@RequestMapping(method=RequestMethod.POST,value="/addroom")
	public void createRoom(@RequestBody Room room) {
		roomResc.createRoom(room);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/roominfo/{roomNo}")
	public void updateRoom(@RequestBody Room room,@PathVariable String roomNo) {
		roomResc.updateRoom(roomNo, room);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/roominfo/{roomNo}")
	public void deleteRoom(@PathVariable String  roomNo) {
		roomResc.deleteRoom(roomNo);
	}
	
	
	//
	
	

}
