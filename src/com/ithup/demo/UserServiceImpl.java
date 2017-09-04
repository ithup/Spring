package com.ithup.demo;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service(value="userService")
public class UserServiceImpl implements UserService{
	@Resource(name="userDao")
	private UserDao userDao;
	
	@Override
	public void add() {
		userDao.save();
	}

}
