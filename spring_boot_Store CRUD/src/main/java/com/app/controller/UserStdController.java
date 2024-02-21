package com.app.controller;

import java.io.IOException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.UserStdDTO;
import com.app.service.UserStdService;

@RestController
@RequestMapping("/userStd")
@CrossOrigin(origins = "http://localhost:3000")
public class UserStdController {
	
	@Autowired
	private UserStdService userStdService;
	
	//Post
	// http://host:port/userStd , method=POST

	@PostMapping
	public ResponseEntity<?> addNewUserStd(@RequestBody @Valid UserStdDTO dto)
	{
		System.out.println("In Add UserStd DTO");
		return ResponseEntity.status(HttpStatus.CREATED).body(userStdService.addNewUserStdDTO(dto));
	}
	
	//Get
	// 2. http://host:port/userStd/{userId} , method=GET
	
	@GetMapping(value = "/{userId}")
	public ResponseEntity<?> getUserStdbyId(@PathVariable Long userId)throws IOException
	{
		System.out.println("Getting userStd  by userId="+userId);
		return ResponseEntity.ok(userStdService.getUserStdDTO(userId));
	}
		
	
	//Put 
	//http://host:port/userStd/{empId} , method=PUT
	
	@PutMapping(value = "/{userId}")
	public ResponseEntity<?> updateUserStd(@PathVariable Long userId, @RequestBody @Valid UserStdDTO dto)
	{
		System.out.println("In update userStd by id="+userId+" "+dto);
		return ResponseEntity.ok(userStdService.updateUserStdDTO(userId, dto));
	}
	
	
	
	
}
