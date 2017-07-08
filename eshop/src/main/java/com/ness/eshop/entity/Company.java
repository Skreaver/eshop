package com.ness.eshop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Company implements Entity {
	
	private int id;
	private String name;
	
}
