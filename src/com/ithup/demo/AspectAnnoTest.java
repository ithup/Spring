package com.ithup.demo;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class AspectAnnoTest {
	@Resource(name="customerDao")
	private CustomerDao customerDao;
	
	@Test
	public void run(){
		customerDao.save();
	}
}
