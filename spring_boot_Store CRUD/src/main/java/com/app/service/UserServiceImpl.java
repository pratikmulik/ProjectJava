package com.app.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.custom_exceptions.ResourceNotFoundException;
import com.app.dao.UserDao;
import com.app.dto.UserDTO;
import com.app.entities.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userRepo;
	
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public UserDTO createUser(UserDTO dto) {
		
		User user= mapper.map(dto, User.class);
		User savedUser=userRepo.save(user);
		System.out.println("User saved in User data");
		return mapper.map(savedUser, UserDTO.class);
	}

	@Override
	public UserDTO findUserById(Long userId) {
		//Optional<User> user=userRepo.findById(userId);
		//return mapper.map(user, UserDTO.class);
		return mapper.map(userRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundException("Invalid Product ID or Product not yet saved"))
				, UserDTO.class);
	}

	@Override
	public UserDTO updateUser(Long userId, UserDTO dto) {
		
		User user =userRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundException("Invalid User Id!!!"));
		mapper.map(dto, user);
		System.out.println("After mapping user="+user);
		userRepo.save(user);
		dto.setUserId(userId);
		return dto;
	}

	@Override
	public Boolean deleteUserById(Long userId) 
	{
		
		User user =userRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundException("Invalid User Id!!!"));
		if(user!=null)
		{
		userRepo.deleteById(userId);
		
		// TODO Auto-generated method stub
		return true;
		}
		else return false;
	}
}
