package io.practise.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.practise.dao.UserDao;
import io.practise.model.Room;
import io.practise.model.Staff;
import io.practise.model.User;
import io.user.exception.StaffException;
import io.user.exception.UserNotFound;




@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	UserDao userRepo;
	

	@Override
	public Collection<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public Optional<User> getUser(String id) {
		// TODO Auto-generated method stub
		Optional<User> user = userRepo.findById(id);
		if (!user.isPresent()) {
			throw new UserNotFound("Id not found");
		}
		return user;
	}


	@Override
	public String createUser(User user) {
		// TODO Auto-generated method stub
		userRepo.insert(user);
		return ("Added with id"+ user.getId());
	}

	@Override
	public String updateUser(String id, User user) {
		// TODO Auto-generated method stub
		userRepo.save(user);
		return("Updated with id"+id);
	}

	@Override
	public String deleteUser(String id) {
		// TODO Auto-generated method stub
		userRepo.deleteById(id);
		return("Delete with id"+id);
	}
	
	
	////Guest

	@Override
	public Collection<Room> getAllRooms() {
		// TODO Auto-generated method stub
		String url="http://Room/room/roominfo";
		Room[] room=restTemplate.getForObject(url,Room[].class);
		return Arrays.asList(room);
	}

	@Override
	public Optional<Room> getRoom(String roomNo) {
		// TODO Auto-generated method stub
		String url="http://Room/room/roominfo/";
		Room room = restTemplate.getForObject(url + roomNo, Room.class);
		return Optional.ofNullable(room);
	}

	@Override
	public String createRoom(Room room) {
		// TODO Auto-generated method stub
		String url="http://Room/room/addroom/";
		restTemplate.postForObject(url, room, Room.class);
		return("Your Guest is added");
	}

	@Override
	public String updateRoom(String roomNo, Room room) {
		// TODO Auto-generated method stub
		String url="http://Room/room/roominfo/";
		restTemplate.put(url+roomNo,room);
		return("Room has been updated"+roomNo);
	}

	@Override
	public String deleteRoom(String roomNo) {
		// TODO Auto-generated method stub
		String url="http://Room/room/roominfo/{roomNo}";
		restTemplate.delete(url,roomNo);
		return("Room has been deleted"+roomNo);
	}

	
	///Inventory 
	
	@Override
	public Collection<Staff> getAllSatff() {
		// TODO Auto-generated method stub
		String url="http://Inventory/inventory/staffinfo";
		Staff[] staff = restTemplate.getForObject(url ,Staff[].class);
		return Arrays.asList(staff);
	}

	@Override
	public Optional<Staff> getStaff(String id) {
		// TODO Auto-generated method stub
		String url="http://Inventory/inventory/staffinfo/";
		Staff staff = restTemplate.getForObject(url + id, Staff.class);
		if(staff.equals(null)) {
			throw new StaffException("Staff was not found");
		}
		return Optional.ofNullable(staff);
	}

	@Override
	public String createStaff(Staff staff) {
		// TODO Auto-generated method stub
		String url="http://Inventory/inventory/addstaff/";
		restTemplate.postForObject(url, staff, Staff.class);
		return("Your Staff is added");
	}

	@Override
	public String updateStaff(String id, Staff staff) {
		// TODO Auto-generated method stub
		String url="http://Inventory/inventory/staffinfo/";
		restTemplate.put(url+id,staff);
		return("Room has been updated"+id);
	}

	@Override
	public String deleteStaff(String id) {
		// TODO Auto-generated method stub
		String url="http://Inventory/inventory/staffinfo/";
		try {
		restTemplate.delete(url+id);
		//restTemplate.delete(url, orderId);
		return("Deleted with id"+"orderId");
	} catch (Exception e) {
		return ("Staff not delete because of " + e + ",with " + id);
	}
	}
	
	
	
	
	


}
