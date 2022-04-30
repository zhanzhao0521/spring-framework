package com.zhanzhao.demo1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class ApplicationStartMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext act = new AnnotationConfigApplicationContext(Config.class);
		User user = act.getBean("user", User.class);
		System.out.println(user);
		act.close();
	}
}

