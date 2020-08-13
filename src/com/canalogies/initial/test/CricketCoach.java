package com.canalogies.initial.test;

public class CricketCoach implements Coach{

	
	private FortuneService fortuneService;
	
	//without constructor the xml wont fit the data
	
	public CricketCoach() {
		System.out.println("no arg constr crick coach");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
		System.out.println("setter method cricket coach");
	}
	
	@Override
	public String getAdvise() {
		 
		return "play 3 hrs cricket "+getFortune();
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}
