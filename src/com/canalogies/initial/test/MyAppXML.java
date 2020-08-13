package com.canalogies.initial.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppXML {

	public static void main(String[] args) {
		//load class path context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//get beans-- other bean implementation can be done by changing the name in the xml file
		Coach coach=context.getBean("myCoach",Coach.class);
		System.out.println(coach.getAdvise());
		coach=context.getBean("myCoach1",Coach.class);
		System.out.println(coach.getAdvise());
		coach=context.getBean("myCricketCoach",Coach.class);
		System.out.println(coach.getAdvise());
		context.close();
		
	}
}
