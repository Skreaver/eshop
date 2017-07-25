package com.ness.eshop.service;

import java.util.List;
import java.util.stream.Collectors;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import com.ness.eshop.domain.BuyerDTO;
import com.ness.eshop.domain.SupplierDTO;
import com.ness.eshop.domain.UserDTO;
import com.ness.eshop.entity.Supplier;
import com.ness.eshop.entity.User;
import com.ness.eshop.mapper.MapperDTOtoSupplier;
import com.ness.eshop.mapper.MapperDTOtoUser;
import com.ness.eshop.mapper.MapperSupplierToDTO;
import com.ness.eshop.mapper.MapperUserToDTO;
import com.ness.eshop.repositery.JPA.AbstractRepositoryJPA;

@Transactional
public class UserServiceImp implements UserService {

	@Autowired
	AbstractRepositoryJPA<User> repository;

	@Autowired
	AbstractRepositoryJPA<Supplier> repositorySupplier;

	@Autowired
	MapperUserToDTO mapperUserToDTO;

	@Autowired
	MapperDTOtoUser mapperDTOtoUser;

	@Autowired
	MapperSupplierToDTO mapperSupplierToDTO;

	@Autowired
	MapperDTOtoSupplier mapperDTOtoSupplier;

	@Override
	public UserDTO findById(int id) {

		return mapperUserToDTO.apply(repository.findById(id));

	}

	@Override
	public List<UserDTO> findAll() {

		return repository.findAll().stream().map(mapperUserToDTO).collect(Collectors.toList());
	}

	@Override
	public User saveUser(UserDTO userDTO) {
		return repository.save(mapperDTOtoUser.apply(userDTO));
	}

	@Override
	public Supplier saveSupplier(SupplierDTO supplierDTO) {

		return repositorySupplier.save(mapperDTOtoSupplier.apply(supplierDTO));
	}

	@Override
	public List<SupplierDTO> findAllSupplier(String StringType) {

		return repositorySupplier.findAllType("Supplier").stream().map(mapperSupplierToDTO)
				.collect(Collectors.toList());
	}

	@Override
	public List<BuyerDTO> findAllBuyer(String StringType) {
		// TODO Auto-generated method stub
		return null;
	}

}
