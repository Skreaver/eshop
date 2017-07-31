package com.ness.eshop.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Product")
public class Product extends EntityInterface {

	public Product(String name, String description, Supplier supplier, BigDecimal price) {
		super();
		this.name = name;
		this.description = description;
		this.supplier = supplier;
		this.price = price;
	}

	public Product() {

	}

	@Id
	@GeneratedValue
	private int id;

	private String name;

	private String description;

	private String image;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "supplier_id")
	private Supplier supplier;

	private BigDecimal price;

}
