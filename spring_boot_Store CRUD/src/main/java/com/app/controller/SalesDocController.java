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

import com.app.dto.SalesDocDTO;
import com.app.service.SalesDocService;

@RestController
@RequestMapping("/salesDoc")
@CrossOrigin(origins = "http://localhost:3000")

public class SalesDocController {
	@Autowired
	private SalesDocService salesDocService;
	
	//Post
		// http://host:port/salesDoc , method=POST

		@PostMapping
		public ResponseEntity<?> addNewSalesDoc(@RequestBody @Valid SalesDocDTO dto)
		{
			System.out.println("In Add Sales DTO");
			return ResponseEntity.status(HttpStatus.CREATED).body(salesDocService.createSalesDoc(dto));
		}
		
		//Get
		// 2. http://host:port/salesDoc/{salesDocId} , method=GET
		@GetMapping(value = "/{salesDocId}")
		public ResponseEntity<?> getSalesDocById(@PathVariable Long salesDocId)throws IOException
		{
			System.out.println("Getting Sales Document by Sales ID="+salesDocId);
			return ResponseEntity.ok(salesDocService.findSalesDocById(salesDocId));
		}

	
}
