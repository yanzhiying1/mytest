package com.yzy.dao;
/**
 * user��dao��
 * @author yanzhiying
 *
 */

import com.yzy.model.User;

public interface UserDao {
	
	public User getUserByUsername(String username);
		
}
