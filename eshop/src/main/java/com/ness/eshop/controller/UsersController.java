package com.ness.eshop.controller;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ness.eshop.entity.Buyer;
import com.ness.eshop.entity.Supplier;
import com.ness.eshop.entity.User;
import com.ness.eshop.service.JPA.AbstractRepositoryJPA;

@RestController
@RequestMapping("/users")
public class UsersController {

	private AbstractRepositoryJPA<User> userRepository;

	private AbstractRepositoryJPA<Supplier> supplierRepository;

	private AbstractRepositoryJPA<Buyer> buyerRepository;

	public UsersController(AbstractRepositoryJPA<User> userRepository,
			AbstractRepositoryJPA<Supplier> supplierRepository, AbstractRepositoryJPA<Buyer> buyerRepository) {
		this.supplierRepository = supplierRepository;
		this.buyerRepository = buyerRepository;
		this.userRepository = userRepository;
	}

	@GetMapping
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@GetMapping
	@RequestMapping("/{id}")
	public User findById(@PathVariable int id) {
		return userRepository.findById(id).orElse(null);
	}

	@PostMapping
	@RequestMapping("/buyer_save")
	public User saveBuyer(Buyer buyer) {

		return buyerRepository.save(buyer);

	}

}
