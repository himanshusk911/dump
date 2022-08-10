package io.hotel.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.stereotype.Component;

import io.hotel.model.Room;


@Component
public interface RoomService {

	Collection<Room> getAllRooms();

	Optional<Room> getRoom(String roomNo);

	String createRoom(Room room);

	String updateRoom(String roomNo, Room room);

	String deleteRoom(String roomNo);

}
