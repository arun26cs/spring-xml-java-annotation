package com.canalogies.initial.test;

public class CricketCoach implements Coach{

	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	//without constructor the xml wont fit the data
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

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
