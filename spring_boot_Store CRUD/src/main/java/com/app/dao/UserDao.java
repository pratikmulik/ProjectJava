package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.app.entities.User;


public interface UserDao extends JpaRepository<User, Long>{

	//Create
//User createUser(User user);
	//Retrieve
//User findUserById(Long userId);
	//Update
//User updateUser(Long userId, User user);
	


//Delete

@Query("delete from User u where u.userId=:userId1")
@Modifying
boolean deleteUserById(Long userId1);

}