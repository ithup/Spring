package com.ithup.demo;

import org.springframework.stereotype.Repository;

@Repository(value="customerDao")
public class CustomerDaoImpl implements CustomerDao {

	@Override
	public void save() {
		//int a=10/0;
		System.out.println("����ͻ���Ϣ��������������������");
	}

	@Override
	public void update() {
		System.out.println("�޸Ŀͻ���Ϣ��������������������");
	}

}
