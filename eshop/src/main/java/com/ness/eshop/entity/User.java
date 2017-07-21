package com.ness.eshop.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="person")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("General")
public class User extends EntityInterface {

	
	
	@Column(unique=true)
	private String login;
	
	private String password;
	
	private String name;
	
	public User(int id, String login, String password, String name) {
		super(id);
		this.login = login;
		this.password = password;
		this.name = name;
	}

	public User(String login, String password, String name) {
		this.login = login;
		this.password = password;
		this.name = name;
	}
	
	public User() {
		
	}
	
	

}
