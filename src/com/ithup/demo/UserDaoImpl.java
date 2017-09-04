package com.ithup.demo;

import org.springframework.stereotype.Repository;

@Repository(value="userDao")
public class UserDaoImpl implements UserDao {
	@Override
	public void save() {
		System.out.println("用户保存成功！");
	}

}
