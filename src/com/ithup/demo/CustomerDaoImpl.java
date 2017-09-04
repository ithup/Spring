package com.ithup.demo;

import org.springframework.stereotype.Repository;

@Repository(value="customerDao")
public class CustomerDaoImpl implements CustomerDao {

	@Override
	public void save() {
		//int a=10/0;
		System.out.println("隠贋人薩佚連。。。。。。。。。。");
	}

	@Override
	public void update() {
		System.out.println("俐個人薩佚連。。。。。。。。。。");
	}

}
