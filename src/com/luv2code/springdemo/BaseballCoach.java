package com.luv2code.springdemo;

public class BaseballCoach implements Coach{

	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneSerivce) {
		fortuneService = theFortuneSerivce;
	}
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on the baseball field";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
