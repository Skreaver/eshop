package com.ness.eshop.mapper;

import java.util.function.Function;

import com.ness.eshop.domain.UserDTO;
import com.ness.eshop.entity.User;

public class MapperUserToDTO  implements Function<User, UserDTO>{


	@Override
	public UserDTO apply(User user) {
		UserDTO userDTO = new UserDTO(user.getLogin(), user.getPassword(), user.getName());
		return userDTO;
	}


}
