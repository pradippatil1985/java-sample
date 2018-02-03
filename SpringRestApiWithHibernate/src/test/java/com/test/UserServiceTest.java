package com.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pradip.user.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:test-restapi-servlet.xml")
public class UserServiceTest {

	@Autowired
	private UserService userService;

	@Test
	public void testAddDummyData() {
		this.userService.addAllDummyUsersData();
	}

}
