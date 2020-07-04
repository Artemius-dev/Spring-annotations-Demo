package com.luv2code.springdemo;

public class WrestlingCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public WrestlingCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "I'm fucking Jhon Cena!!!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortuen();
	}

}
