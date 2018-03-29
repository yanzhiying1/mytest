package com.yzy.serviceTest;


import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.yzy.model.User;
import com.yzy.service.UserService;

import comyzy.baseTest.SpringTestCase;

public class UserServiceTest extends SpringTestCase{
	
	@Autowired
	private UserService userService;
	
	Logger logger = Logger.getLogger(UserServiceTest.class);
	
	@Test
	public void getUserByusername(){
		User user = userService.getUserByUsername("aaa");
		logger.debug("查询结果"+user);
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
	
	
}
