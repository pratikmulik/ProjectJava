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

import com.app.dto.CartDTO;
import com.app.service.CartService;

@RestController
@RequestMapping("/cart")
@CrossOrigin(origins = "http://localhost:3000")

public class CartController 
{
	@Autowired
	private CartService cartService;
	
	//Post
		// http://host:port/cart , method=POST

		@PostMapping
		public ResponseEntity<?> addNewCart(@RequestBody @Valid CartDTO dto)
		{
			System.out.println("In Add Cart DTO");
			return ResponseEntity.status(HttpStatus.CREATED).body(cartService.createCart(dto));
		}
		
		//Get
		// 2. http://host:port/cart/{cartId} , method=GET
		
		@GetMapping(value = "/{cartId}")
		public ResponseEntity<?> getProductStdById(@PathVariable Long cartId)throws IOException
		{
			System.out.println("Getting Cart by cart ID="+cartId);
			return ResponseEntity.ok(cartService.findCartById(cartId));
		}

}
