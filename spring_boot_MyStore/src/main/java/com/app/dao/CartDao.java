package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Cart;

public interface CartDao extends JpaRepository<Cart, Long> 
{
		//Create
	Cart createCart(Cart cart);
	
		//Retrieve
	Cart findCartById(Long cartId);

}
