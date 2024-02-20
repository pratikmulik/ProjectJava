package com.app.service;

import com.app.dto.UserDTO;

public interface UserService {
	
	
UserDTO createUser(UserDTO dto);
	
UserDTO findUserById(Long userId);
	
UserDTO updateUser(Long userId, UserDTO dto);

Boolean deleteUserById(Long userId);
}
