package com.app.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.app.custom_exceptions.ResourceNotFoundException;
import com.app.dao.UserStdDao;
import com.app.dto.UserStdDTO;
import com.app.entities.UserStd;

public class UserStdServiceImp implements UserStdService {

	@Autowired
	private UserStdDao userStdRepo;
	
	@Autowired
	private ModelMapper mapper;
	
		
	@Override
	public UserStdDTO addNewUserStdDTO(UserStdDTO dto) {
		UserStd user =mapper.map(dto, UserStd.class);
		
		UserStd savedUserStd=userStdRepo.save(user);
		System.out.println("User saved in Master data");
		return mapper.map(savedUserStd, UserStdDTO.class);
	}
	
	@Override
	public UserStdDTO updateUserStdDTO(Long userId, UserStdDTO dto) {
		
		UserStd user=userStdRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundException("Invalid User Id!!!"));
		mapper.map(dto, user);
		System.out.println("After mapping user="+user);
		userStdRepo.save(user);
		dto.setUserId(userId);
		return dto;
		
	}
	
	@Override
	public UserStdDTO getUserStdDTO(Long userId) {
		UserStd user=userStdRepo.findUserStdById(userId);
		return mapper.map(user, UserStdDTO.class);
	}

}
