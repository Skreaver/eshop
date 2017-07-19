package com.ness.eshop.entity;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Product extends EntityInterface {

	private int id;
	private String name;
	private String description;
	private String image;
	private int supplier;
	private BigDecimal price;

}
