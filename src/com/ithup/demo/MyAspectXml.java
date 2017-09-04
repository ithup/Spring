package com.ithup.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 * �����ࣺ�����+֪ͨ
 * @author acer
 *
 */
@Component(value="aspectClass")
public class MyAspectXml {
	
	/**
	 * ��ǿ
	 */
	public void log(){
		System.out.println("��־�Ѽ�¼��");
	}
	/**
	 * ����֪ͨ
	 * 		��Ŀ����ķ���ִ��֮��ִ�У�����������쳣������֪ͨҲ��ִ��
	 * 
	 */
	public void after(){
		System.out.println("����֪ͨ....................");
	}
	
	/**
	 * ����֪ͨ��
	 * 		��������ִ�к�֪ͨ
	 */
	public void afterReturning(){
		System.out.println("����֪ͨ����������������������������������");
	}
	
	/**
	 * �쳣�׳�֪ͨ��
	 * 		���׳��쳣��֪ͨ
	 */
	public void afterThrowing(){
		System.out.println("�쳣�׳�֪ͨ������������������������������������");
	}
	
	/**
	 * ����֪ͨ��
	 * 		����ִ��ǰ��ִ��
	 * 		Ҫע�⣺Ŀ��ķ���Ĭ�ϲ�ִ�У���Ҫʹ��ProceedingJoinPoint������Ŀ�����ķ���ִ�С�
	 */
	public void around(ProceedingJoinPoint joinPoint){
		System.out.println("�������񡣡���������������������������");
		
		try {
			joinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		System.out.println("�ύ���񡣡���������������������������");
	}
	
	
}
