package com.ness.eshop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Company extends EntityInterface {
	
	private int id;
	private String name;
	
}
