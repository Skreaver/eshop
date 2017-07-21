package com.ness.eshop.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@MappedSuperclass
public abstract class EntityInterface {

	@Id
	@GeneratedValue
	private int id;

	public EntityInterface() {
		
	}
	
	
	

}
