package com.app.service;

import org.springframework.stereotype.Service;

import com.app.dto.UserDTO;
@Service
public interface UserService {
	
	
UserDTO createUser(UserDTO dto);
	
UserDTO findUserById(Long userId);
	
UserDTO updateUser(Long userId, UserDTO dto);

Boolean deleteUserById(Long userId);
}
