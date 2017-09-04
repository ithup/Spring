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
 * 申明切面类
 * @author acer
 *
 */
@Component(value="myAspectAnno")
@Aspect
public class MyAspectAnno {
	//定义切入点表达式
	@Pointcut(value="execution(* com.ithup.demo.CustomerDaoImpl.save(..))")
	public void joinPoint(){}
	
	@Before(value="MyAspectAnno.joinPoint()")
	public void log(){
		System.out.println("日记记录。。。。。。。。。。。。。。。。。。");
	}
	
	@Around(value="MyAspectAnno.joinPoint()")
	public void around(ProceedingJoinPoint joinPoint){
		System.out.println("开启事务。。。。。。。。。。。。。");
		try {
			joinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("提交事务。。。。。。。。。。。。。");
	}
	
	@After(value="MyAspectAnno.joinPoint()")
	public void after(){
		System.out.println("最终通知。。。。。。。。。。。。。。。");
	}
	
	@AfterReturning(value="MyAspectAnno.joinPoint()")
	public void afterThrowing(){
		System.out.println("后置通知。。。。。。。。。。。。。。。");
	}
}
