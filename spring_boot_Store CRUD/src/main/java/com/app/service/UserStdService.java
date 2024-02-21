package com.app.service;

import org.springframework.stereotype.Service;

import com.app.dto.UserStdDTO;

@Service
public interface UserStdService 

{

	UserStdDTO addNewUserStdDTO(UserStdDTO dto);

	UserStdDTO updateUserStdDTO(Long userId, UserStdDTO dto);

	UserStdDTO getUserStdDTO(Long userId);
	
}
