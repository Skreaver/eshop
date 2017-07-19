package com.ness.eshop.entity;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Order extends EntityInterface {
	private int id;
	private int buyer;
	private Date orderDate;
}
