package com.yzy.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yzy.dao.UserDao;
import com.yzy.model.User;
import com.yzy.service.UserService;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	

	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public User getUserByUsername(String username) {
		
		return userDao.getUserByUsername(username);
	}
	
	
	
}
