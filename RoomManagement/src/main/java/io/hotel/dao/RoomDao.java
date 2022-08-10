package io.hotel.dao;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import io.hotel.model.Room;




@Repository
public interface RoomDao extends MongoRepository<Room,String> {

	Optional<Room> findByRoomNo(String RoomNo);





}