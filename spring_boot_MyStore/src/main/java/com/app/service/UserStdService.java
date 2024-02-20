package com.app.service;

import com.app.dto.UserStdDTO;

public interface UserStdService 

{

	UserStdDTO addNewUserStdDTO(UserStdDTO dto);

	UserStdDTO updateUserStdDTO(Long userId, UserStdDTO dto);

	UserStdDTO getUserStdDTO(Long userId);
	
}
