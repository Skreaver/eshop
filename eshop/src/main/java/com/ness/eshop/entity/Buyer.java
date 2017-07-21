package com.ness.eshop.entity;

import java.math.BigDecimal;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@DiscriminatorValue("Buyer")
public class Buyer extends User {

	private int company;
	private BigDecimal creditLimit;
	
	public Buyer(int id, String login, String password, String name, int company, BigDecimal creditLimit) {
		super(id, login, password, name);
		this.company = company;
		this.creditLimit = creditLimit;
	}
	

	public Buyer(String login, String password, String name, int company, BigDecimal creditLimit) {
		super(login, password, name);
		this.company = company;
		this.creditLimit = creditLimit;
	}


	public Buyer() {
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + company;
		result = prime * result + ((creditLimit == null) ? 0 : creditLimit.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Buyer other = (Buyer) obj;
		if (company != other.company)
			return false;
		if (creditLimit == null) {
			if (other.creditLimit != null)
				return false;
		} else if (!creditLimit.equals(other.creditLimit))
			return false;
		return true;
	}




	

}
