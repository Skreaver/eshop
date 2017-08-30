package com.ness.eshop.repositery;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
import com.ness.eshop.domain.UserDTO;

import com.ness.eshop.mapper.MapperDTOtoUser;
import com.ness.eshop.service.UserServiceImp;

public class UserServiceImpMockTest {

	private static UserServiceImp mockedUserService;
	private static UserDTO user1;
	private static UserDTO user2;

	private static MapperDTOtoUser mapperDTOtoUser = new MapperDTOtoUser();

	@BeforeClass
	public static void setUp() {

		mockedUserService = mock(UserServiceImp.class);
		user1 = new UserDTO("Peky", "123", "Rado");
		user2 = new UserDTO("Rolo", "123", "Roland");

		when(mockedUserService.findAll()).thenReturn(Arrays.asList(user1, user2));
		when(mockedUserService.findById(7)).thenReturn(user1);
		when(mockedUserService.saveUser(user2)).thenReturn(mapperDTOtoUser.apply(user2));
	}

	@Test
	public void findByIdTest() {
		
		int id = 7;
		
		UserDTO findedUser = mockedUserService.findById(id);
		
		assertNotNull(findedUser);
		assertEquals(user1.getLogin(), findedUser.getLogin());

	}

	@Test
	public void saveUserTest() {
		
		String name = mockedUserService.saveUser(user2).getName();
		
		assertNotNull(name);
		assertEquals(user2.getName(), name);
		

	}

	@Test
	public void findAllTest() {
		List<UserDTO> users = mockedUserService.findAll();
		assertEquals(2, users.size());

		UserDTO user = users.get(0);

		assertEquals("Peky", user.getLogin());
		assertEquals("123", user.getPassword());
		assertEquals("Rado", user.getName());

	}
}
