package com.app.service;

import com.app.dto.CartDTO;

public interface CartService 
{
	
	CartDTO createCart(CartDTO dto);
	
	CartDTO findCartById(Long cartId);
		
}
