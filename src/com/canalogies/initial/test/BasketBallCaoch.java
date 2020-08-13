package com.canalogies.initial.test;

public class BasketBallCaoch implements Coach{

	private FortuneService fortuneService;
	
	//without constructor the xml wont fit the data
	
	public BasketBallCaoch(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	
	@Override
	public String getAdvise() {
		
		return "get 5 hour basketball practise "+getFortune();
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
