package com.ness.eshop.repositery;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ness.eshop.entity.Company;
import com.ness.eshop.entity.User;
import com.ness.eshop.service.UserServiceSORM;



public class RepositoryTest {

	Company vlaky = new Company(2, "vlaky");
	Company zel = new Company(0, "zeleznice");
	
	User marek = new User(0, "Marko","123", "Marek Halecky");
	User rado = new User(0, "Rado","123", "Rado Balucha");
	User roman = new User(2, "roky","321", "Roman Caplar");

	UserServiceSORM userServiceSORM = new UserServiceSORM(User.class);


	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void add() {

		userServiceSORM.save(rado);
		
		Object o = userServiceSORM.findById(6);
		
		String name = o.toString();

		System.out.println(name);
		//assertEquals(rado, name);
	

	}

}
