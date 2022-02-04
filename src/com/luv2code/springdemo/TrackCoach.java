package com.luv2code.springdemo;

public class TrackCoach implements Coach {

private FortuneService fortuneService;
	
	public TrackCoach() {
	}
	
	public TrackCoach(FortuneService theFortuneSerivce) {
		fortuneService = theFortuneSerivce;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5K";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
