package com.app.controller;

import java.io.IOException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.UserDTO;
import com.app.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	//Post
	// http://host:port/user , method=POST

	@PostMapping
	public ResponseEntity<?> addNewUser(@RequestBody @Valid UserDTO dto)
	{
		System.out.println("In Add User DTO");
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(dto));
	}
	
	//Get
	// 2. http://host:port/user/{userId} , method=GET
	
	@GetMapping(value = "/{userId}")
	public ResponseEntity<?> getUserbyId(@PathVariable Long userId)throws IOException
	{
		System.out.println("Getting user  by userId="+userId);
		return ResponseEntity.ok(userService.findUserById(userId));
	}
		
	
	//Put 
	//http://host:port/user/{empId} , method=PUT
	
	@PutMapping(value = "/{userId}")
	public ResponseEntity<?> updateUser(@PathVariable Long userId, @RequestBody @Valid UserDTO dto)
	{
		System.out.println("In update user by id="+userId+" "+dto);
		return ResponseEntity.ok(userService.updateUser(userId, dto));
	}
	
	//Delete
	//2. http://host:port/user/{userId} , method=DELETE
	@DeleteMapping(value ="/{userId}")
	public ResponseEntity<?> deleteUser (@PathVariable Long userId)throws IOException
	{
		System.out.println("Deleting user by userId="+userId);
		return ResponseEntity.ok(userService.deleteUserById(userId));
	}
	
	
	
	
}