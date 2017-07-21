package com.ness.eshop.service;


import java.util.List;

import com.ness.eshop.domain.UserDTO;
import com.ness.eshop.entity.User;

public interface UserService {
	
	UserDTO findById(int id);
	
	User saveUser(UserDTO userDTO);

	List<UserDTO> findAll();
	
	

}