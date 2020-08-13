package com.canalogies.initial.test;

import org.springframework.beans.factory.annotation.Autowired;

public class MyApp {
	
	public static void main(String[] args) {
		
		 
		
		Coach coach = new BasketBallCaoch();
		System.out.println(coach.getAdvise());
		
		coach = new TrackCoach();
		System.out.println(coach.getAdvise());
	}
}
