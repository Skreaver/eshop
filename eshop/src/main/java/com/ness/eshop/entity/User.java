package com.ness.eshop.entity;

import com.ness.eshop.serrvice.annotation.Column;
import com.ness.eshop.serrvice.annotation.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Table(name ="Person", createDrop = true)
public class User implements Entity {

	@Column(name = "id" , primaryKey = true)
	private int id;
	
	@Column(name = "login")
	private String login;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "name")
	private String name;
	
	public User(){
		
	}


}
