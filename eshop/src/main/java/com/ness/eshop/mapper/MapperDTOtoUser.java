package com.ness.eshop.mapper;

import java.util.function.Function;

import com.ness.eshop.domain.UserDTO;
import com.ness.eshop.entity.User;

public class MapperDTOtoUser implements Function<UserDTO, User> {

	@Override
	public User apply(UserDTO userDTO) {

		User user = new User(userDTO.getLogin(), userDTO.getPassword(), userDTO.getName());
		return user;
	}

}
