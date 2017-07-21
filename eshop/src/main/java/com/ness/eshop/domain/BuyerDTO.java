package com.ness.eshop.domain;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BuyerDTO extends UserDTO{
	
	private int company;
	private BigDecimal creditLimit;
	


	public BuyerDTO(String login, String password, String name, int company, BigDecimal creditLimit) {
		super(login, password, name);
		this.company = company;
		this.creditLimit = creditLimit;
	}
	
	


}
