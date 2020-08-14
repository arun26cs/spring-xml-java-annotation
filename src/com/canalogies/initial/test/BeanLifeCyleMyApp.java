package com.canalogies.initial.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCyleMyApp {

public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext2.xml");
		
		Coach coach1 = context.getBean("myCoach",Coach.class);
		 
		
		context.close();
	}
}
