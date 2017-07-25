package com.ness.eshop.entity;

import javax.persistence.Entity;

@Entity
public class Supplier extends User {

	public Supplier(String login, String password, String name) {
		super(login, password, name);
		// TODO Auto-generated constructor stub
	}

	public Supplier() {

	}
}
