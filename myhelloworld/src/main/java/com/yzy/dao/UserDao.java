package com.yzy.dao;
/**
 * userµÄdaoÀà
 * @author yanzhiying
 *
 */

import com.yzy.model.User;

public interface UserDao {
	
	public User getUserByUsername(String username);
		
}
