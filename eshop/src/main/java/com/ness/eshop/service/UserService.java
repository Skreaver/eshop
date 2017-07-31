package com.ness.eshop.service;


import java.util.List;

import com.ness.eshop.domain.BuyerDTO;
import com.ness.eshop.domain.SupplierDTO;
import com.ness.eshop.domain.UserDTO;
import com.ness.eshop.entity.Supplier;
import com.ness.eshop.entity.User;

public interface UserService {
	
	UserDTO findById(int id);
	
	User saveUser(UserDTO userDTO);

	List<UserDTO> findAll();
	
	Supplier saveSupplier(SupplierDTO supplierDTO);

	List<SupplierDTO> findAllSupplier(String supplier);
	
	List<BuyerDTO> findAllBuyer(String buyer);
	
	

}