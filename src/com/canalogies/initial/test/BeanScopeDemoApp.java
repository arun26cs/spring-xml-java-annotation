package com.canalogies.initial.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach coach1 = context.getBean("myCoach",Coach.class);
		Coach coach2 = context.getBean("myCoach",Coach.class);
		
		System.out.println("Is the beans same? "+(coach1 == coach2));
		System.out.println("Bean1 "+coach1);
		System.out.println("Bean1 "+coach2);
		context.close();
	}
}
