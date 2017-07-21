package com.ness.eshop.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Supplier")
public class Supplier extends User {

	public Supplier(String login, String password, String name) {
		super(login, password, name);
	}
	
	public Supplier() {
		
	}
}
