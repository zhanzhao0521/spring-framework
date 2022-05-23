package com.zhanzhao.demo2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationStartMain {
	public static void main(String[] args) {
	    ApplicationContext act = new ClassPathXmlApplicationContext("demo2/applicationContext.xml");
		A a = act.getBean("a", A.class);
		B b = act.getBean("b", B.class);

	}
}
