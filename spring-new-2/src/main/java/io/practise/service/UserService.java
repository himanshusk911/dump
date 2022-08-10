package io.practise.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.stereotype.Component;

import io.practise.model.Room;
import io.practise.model.Staff;
import io.practise.model.User;


@Component
public interface UserService {

	Collection<User> getAllUser();

	Optional<User> getUser(String id);

	String createUser(User user);

	String updateUser(String id, User user);

	String deleteUser(String id);

	Collection<Room> getAllRooms();

	Optional<Room> getRoom(String roomNo);

	String createRoom(Room room);

	String updateRoom(String roomNo, Room room);

	String deleteRoom(String roomNo);

	Collection<Staff> getAllSatff();

	Optional<Staff> getStaff(String id);

	String createStaff(Staff staff);

	String updateStaff(String id, Staff staff);

	String deleteStaff(String id);
	

}
