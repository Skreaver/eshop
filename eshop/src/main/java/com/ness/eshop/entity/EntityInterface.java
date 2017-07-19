package com.ness.eshop.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class EntityInterface {

	@Id
	@GeneratedValue
	private int id;
	
	public int getId() {
		return 0;
	}
	

	public void setId(int id) {
		this.id = id;
	}

	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}

}
