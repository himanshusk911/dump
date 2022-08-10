package io.practise.controller;

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

import io.practise.model.Room;
import io.practise.model.Staff;
import io.practise.model.User;
import io.practise.service.UserService;



@RestController
@RequestMapping("/user")
@CrossOrigin("http://localhost:3000")
public class UserController {
	
	@Autowired
	UserService userResc;
	
	@RequestMapping("/owner")
	public String home() {
		return ("Welcome ");
	}
	
	@RequestMapping("/manager")
	public String manager() {
		return ("Welcome ");
	}
	@RequestMapping("/recep")
	public String recep() {
		return ("Welcome ");
	}

	@RequestMapping("/userinfo")
	public Collection<User> getAllUser(){
		return userResc. getAllUser();
	}

	@GetMapping("/userinfo/{id}")
	public  Optional<User> getUser(@PathVariable String id){
		return userResc.getUser(id);
	}
	@RequestMapping(method=RequestMethod.POST,value="/adduser")
	public void createUser(@RequestBody User user) {
		userResc.createUser(user);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/userinfo/{id}")
	public void updateUser(@RequestBody User user,@PathVariable String id) {
		userResc.updateUser(id, user);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/userinfo/{id}")
	public void deleteUser(@PathVariable String  id) {
		userResc.deleteUser(id);
	}
	
	
	
	///GuestManagement
	
	@RequestMapping("/roominfo")
	public Collection<Room> getAllRooms(){
		return userResc. getAllRooms();
	}
	
	@GetMapping("/roominfo/{roomNo}")
	public  Optional<Room> getRoom(@PathVariable String roomNo){
		return userResc.getRoom(roomNo);
	}
	@RequestMapping(method=RequestMethod.POST,value="/addroom")
	public void createRoom(@RequestBody Room room) {
		userResc.createRoom(room);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/roominfo/{roomNo}")
	public void updateRoom(@RequestBody Room room,@PathVariable String roomNo) {
		userResc.updateRoom(roomNo, room);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/roominfo/{roomNo}")
	public void deleteRoom(@PathVariable String  roomNo) {
		userResc.deleteRoom(roomNo);
	}
	
	//inventory
	
	
	@RequestMapping("/staffinfo")
	public Collection<Staff> getAllStaff(){
		return userResc. getAllSatff();
	}

	@GetMapping("/staffinfo/{id}")
	public  Optional<Staff> getSatff(@PathVariable String id){
		return userResc.getStaff(id);
	}
	@RequestMapping(method=RequestMethod.POST,value="/addstaff")
	public void createStaff(@RequestBody Staff staff) {
		userResc.createStaff(staff);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/staffinfo/{id}")
	public void updateStaff(@RequestBody Staff staff,@PathVariable String id) {
		userResc.updateStaff(id, staff);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/staffinfo/{id}")
	public void deleteStaff(@PathVariable String  id) {
		userResc.deleteStaff(id);
	}
	
}
