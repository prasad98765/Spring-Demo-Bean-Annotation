package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	public CricketCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkOut() {
		return "Pratice On Bowling ";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getForune();
	}

}
