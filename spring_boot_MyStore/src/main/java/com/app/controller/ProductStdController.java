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

import com.app.dto.ProductStdDTO;
import com.app.service.ProductStdService;

@RestController
@RequestMapping("/productStd")
@CrossOrigin(origins = "http://localhost:3000")


public class ProductStdController 
{

	@Autowired
	private ProductStdService productStdService;
	
	//Post
		// http://host:port/productStd , method=POST

		@PostMapping
		public ResponseEntity<?> addNewProductStd(@RequestBody @Valid ProductStdDTO dto)
		{
			System.out.println("In Add ProductStd DTO");
			return ResponseEntity.status(HttpStatus.CREATED).body(productStdService.createProductStd(dto));
		}
		
		//Get
		// 2. http://host:port/productStd/{productId} , method=GET
		
		@GetMapping(value = "/{productId}")
		public ResponseEntity<?> getProductStdById(@PathVariable Long productId)throws IOException
		{
			System.out.println("Getting productStd by product ID="+productId);
			return ResponseEntity.ok(productStdService.findProductStdById(productId));
		}
			
		
		
		//Put 
		//http://host:port/productStd/{productId} , method=PUT
		
		@PutMapping(value = "/{productId}")
		public ResponseEntity<?> updateProductStd(@PathVariable Long productId, @RequestBody @Valid ProductStdDTO dto)
		{
			System.out.println("In update productStd by id="+productId+" "+dto);
			return ResponseEntity.ok(productStdService.updateProductStd(productId, dto));
		}
		
		
}
