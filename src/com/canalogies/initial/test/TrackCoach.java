package com.canalogies.initial.test;

public class TrackCoach implements Coach {

private FortuneService fortuneService;
	
	//without constructor the xml wont fit the data
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	
	
	@Override
	public String getAdvise() {
		return "get 10 hrs of track coach "+getFortune();
	}
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
}
