package io.inventory.dao;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import io.inventory.model.Staff;

@Repository
public interface InventoryDao extends MongoRepository<Staff,String> {

	Optional<Staff> findByUsername(String username);





}