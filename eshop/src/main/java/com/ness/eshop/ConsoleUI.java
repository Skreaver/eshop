package com.ness.eshop;

import java.math.BigDecimal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import com.ness.eshop.entity.Buyer;
import com.ness.eshop.entity.Supplier;
import com.ness.eshop.entity.User;
import com.ness.eshop.service.JPA.AbstractRepositoryJPA;

public class ConsoleUI implements UserInterface {

	User user;
	Buyer buyer;
	Supplier supplier;
	List<User> users;

	@Autowired
	AbstractRepositoryJPA<User> userRepository;
	@Autowired
	AbstractRepositoryJPA<Buyer> buyerRepository;
	@Autowired
	AbstractRepositoryJPA<Supplier> supplierRepository;

	@Override
	public void run() {

		user = new User(4, "Boss", "159", "Peter Kovac");
		buyer = new Buyer(1, "Rastik", "357", "Rasto Mocny", 1, BigDecimal.valueOf(25.659).movePointLeft(2));
		supplier = new Supplier(5, "rex", "2587", "Arnold Fukar");
		
		//System.out.println(userRepository.findById(4));
		//System.out.println(userRepository.findAll());
		
		
		try {
			supplierRepository.save(supplier);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
