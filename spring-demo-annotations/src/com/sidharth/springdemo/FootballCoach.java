package com.sidharth.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class FootballCoach implements Coach {

	private FortuneService fortuneService;
	
	public FootballCoach() {
		System.out.println("Inside no-arg constructor of FootballCoach");
	}
	
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		return "Practice on your defence";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
