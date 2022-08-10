package io.practise.dao;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import io.practise.model.User;




@Repository
public interface UserDao  extends MongoRepository<User,String> {

	User findByUsername(String username);
	

	





}
