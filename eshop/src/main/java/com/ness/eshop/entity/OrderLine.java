package com.ness.eshop.entity;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class OrderLine {

	private int id;
	private int order;
	private int lineNumber;
	private int product;
	private int quantity;
	private BigDecimal price;

}
