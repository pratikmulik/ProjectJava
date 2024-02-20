package com.app.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.app.dao.CartDao;
import com.app.dto.CartDTO;
import com.app.entities.Cart;

public class CartServiceImpl implements CartService {

	@Autowired
	private CartDao cartRepo;
	
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public CartDTO createCart(CartDTO dto) {
		Cart cart =mapper.map(dto, Cart.class);
		
		Cart savedCart=cartRepo.save(cart);
		System.out.println("Cart saved in database");
		return mapper.map(savedCart, CartDTO.class);
	}

	@Override
	public CartDTO findCartById(Long cartId) {
		Cart cart=cartRepo.findCartById(cartId);
		return mapper.map(cart, CartDTO.class);
	}

}
