package com.ness.eshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.ness.eshop.domain.SupplierDTO;
import com.ness.eshop.domain.UserDTO;
import com.ness.eshop.entity.Supplier;
import com.ness.eshop.entity.User;
import com.ness.eshop.service.UserService;


@RestController
@RequestMapping("/users")
public class UsersController {

	@Autowired
	public UserService userService;

	@GetMapping
	@RequestMapping("/{id}")
	public UserDTO findById(@PathVariable int id) {

		return userService.findById(id);
	}

	
	@GetMapping
	@RequestMapping("/all")
	public List<UserDTO> findAll() {

		return userService.findAll();
	}

	@PostMapping
	@RequestMapping("/save")
	public User saveUser(UserDTO userDTO) {

		return userService.saveUser(userDTO);
	}
	

	@GetMapping
	@RequestMapping("/all_supplier")
	public List<SupplierDTO> all_supplier() {

		return userService.findAllSupplier("Supplier");
	}
	
}
