package com.app.service;

import org.springframework.stereotype.Service;

import com.app.dto.CartDTO;
@Service
public interface CartService 
{
	
	CartDTO createCart(CartDTO dto);
	
	CartDTO findCartById(Long cartId);
		
}
