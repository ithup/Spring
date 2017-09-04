package com.ithup.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * ����������
 * @author acer
 *
 */
@Component(value="myAspectAnno")
@Aspect
public class MyAspectAnno {
	//�����������ʽ
	@Pointcut(value="execution(* com.ithup.demo.CustomerDaoImpl.save(..))")
	public void joinPoint(){}
	
	@Before(value="MyAspectAnno.joinPoint()")
	public void log(){
		System.out.println("�ռǼ�¼������������������������������������");
	}
	
	@Around(value="MyAspectAnno.joinPoint()")
	public void around(ProceedingJoinPoint joinPoint){
		System.out.println("�������񡣡�����������������������");
		try {
			joinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("�ύ���񡣡�����������������������");
	}
	
	@After(value="MyAspectAnno.joinPoint()")
	public void after(){
		System.out.println("����֪ͨ������������������������������");
	}
	
	@AfterReturning(value="MyAspectAnno.joinPoint()")
	public void afterThrowing(){
		System.out.println("����֪ͨ������������������������������");
	}
}
