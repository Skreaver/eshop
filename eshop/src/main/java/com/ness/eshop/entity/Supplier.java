package com.ness.eshop.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Supplier")
public class Supplier extends User {

	public Supplier(int id, String login, String password, String name) {
		super(id, login, password, name);
	}
	
	public Supplier() {
		
	}
}
