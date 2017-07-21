package com.ness.eshop.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ness.eshop.domain.UserDTO;
import com.ness.eshop.entity.User;
import com.ness.eshop.mapper.MapperDTOtoUser;
import com.ness.eshop.mapper.MapperUserToDTO;
import com.ness.eshop.repositery.JPA.AbstractRepositoryJPA;

@Transactional
public class UserServiceImp implements UserService {

	@Autowired
	AbstractRepositoryJPA<User> repository;

	@Autowired
	MapperUserToDTO mapperUserToDTO;
	
	@Autowired
	MapperDTOtoUser mapperDTOtoUser;

	
	

	@Override
	public UserDTO findById(int id) {

		return mapperUserToDTO.apply(repository.findById(id));
		
	}
	
	@Override
	public List<UserDTO> findAll(){
		
		return repository.findAll().stream().map(mapperUserToDTO).collect(Collectors.toList());
	}

	@Override
	public User saveUser(UserDTO userDTO) {
		return repository.save(mapperDTOtoUser.apply(userDTO));
	}

	

}
