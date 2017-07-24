package com.ness.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ness.eshop.domain.UserDTO;
import com.ness.eshop.service.UserService;

@Controller
public class MainController {

	@Autowired
	UserService userService;

	@RequestMapping(value = { "/", "home" })
	public String home() {

		return "home";
	}

	@RequestMapping(value = { "/wellcome" })
	public String welcome() {
		return "wellcome";
	}

	@RequestMapping(value = "/admin")
	public String admin() {
		return "admin";
	}

	@RequestMapping(value = { "/login" })
	@PostMapping
	public String login() {
		return "login";
	}

	@RequestMapping(value = "/403")
	public String Error403() {
		return "403";
	}

	@PostMapping
	@RequestMapping(value = "/registration")
	public String registration(UserDTO userDTO) {

		userService.saveUser(userDTO);
		return "admin";
	}

}
