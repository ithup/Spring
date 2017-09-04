package com.ithup.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 * 切面类：切入点+通知
 * @author acer
 *
 */
@Component(value="aspectClass")
public class MyAspectXml {
	
	/**
	 * 增强
	 */
	public void log(){
		System.out.println("日志已记录！");
	}
	/**
	 * 最终通知
	 * 		在目标类的方法执行之后执行，如果出现了异常，最终通知也会执行
	 * 
	 */
	public void after(){
		System.out.println("最终通知....................");
	}
	
	/**
	 * 后置通知：
	 * 		方法正常执行后通知
	 */
	public void afterReturning(){
		System.out.println("后置通知。。。。。。。。。。。。。。。。。");
	}
	
	/**
	 * 异常抛出通知：
	 * 		在抛出异常后通知
	 */
	public void afterThrowing(){
		System.out.println("异常抛出通知。。。。。。。。。。。。。。。。。。");
	}
	
	/**
	 * 环绕通知：
	 * 		方法执行前后执行
	 * 		要注意：目标的方法默认不执行，需要使用ProceedingJoinPoint对来让目标对象的方法执行。
	 */
	public void around(ProceedingJoinPoint joinPoint){
		System.out.println("开启事务。。。。。。。。。。。。。。。");
		
		try {
			joinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		System.out.println("提交事务。。。。。。。。。。。。。。。");
	}
	
	
}
