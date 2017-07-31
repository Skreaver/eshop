package com.ness.eshop.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Supplier")
public class Supplier extends User {

	public Supplier(String login, String password, String name) {
		super(login, password, name);
		// TODO Auto-generated constructor stub
	}

	public Supplier() {

	}

	@OneToMany(mappedBy = "supplier", cascade = CascadeType.ALL) // mappedBy - name of object in product
	private List<Product> products;

	public void addProduct(Product product) {
		products.add(product);
		product.setSupplier(this);
		
	}




	
	
}
