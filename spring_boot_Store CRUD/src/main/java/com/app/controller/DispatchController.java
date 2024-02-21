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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.DispatchDTO;
import com.app.service.DispatchService;

@RestController
@RequestMapping("/dispatch")
@CrossOrigin(origins = "http://localhost:3000")


public class DispatchController 
{

	@Autowired
	private DispatchService dispatchService;
	
	//Post
		// http://host:port/dispatch , method=POST

		@PostMapping
		public ResponseEntity<?> addNewDispatch(@RequestBody @Valid DispatchDTO dto)
		{
			System.out.println("In Add Dispatch DTO");
			return ResponseEntity.status(HttpStatus.CREATED).body(dispatchService.createDispatch(dto));
		}
		
		//Get
		// 2. http://host:port/dispatch/{dispatchId} , method=GET
		
		@GetMapping(value = "/{dispatchId}")
		public ResponseEntity<?> getDispatchById(@PathVariable Long dispatchId)throws IOException
		{
			System.out.println("Getting Dispatch details by ID="+dispatchId);
			return ResponseEntity.ok(dispatchService.findDispatchById(dispatchId));
		}
	
	
}
