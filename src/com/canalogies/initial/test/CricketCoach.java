package com.canalogies.initial.test;

public class CricketCoach implements Coach{

	
	private FortuneService fortuneService;
	
	//without constructor the xml wont fit the data
	
	public CricketCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
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
