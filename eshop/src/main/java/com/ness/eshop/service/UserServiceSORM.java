package com.ness.eshop.service;

import com.ness.eshop.entity.User;

public class UserServiceSORM extends AbstractRepositerySORM<User> {

	public UserServiceSORM(Class<User> type) {
		super(type);
	}

}
