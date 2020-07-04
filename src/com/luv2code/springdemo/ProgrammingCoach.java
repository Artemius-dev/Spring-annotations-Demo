package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class ProgrammingCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice code 7 hours";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
