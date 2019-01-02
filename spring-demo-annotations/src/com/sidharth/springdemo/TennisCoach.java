package com.sidharth.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope()
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	/*@Autowired
	public TennisCoach(FortuneService fortunService) {
		this.fortuneService=fortunService;
	}*/
	
	//define a no-arg constructor
	public TennisCoach() {
		System.out.println("Inside the no-arg constructor of TennisCoach");
	}
	
	// Define Init method
	@PostConstruct
	public void doMyStartupStuff() {
		
		System.out.println("TennisCoach: Inside doMyStartupStuff()");
	}
	
	// Define Destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		
		System.out.println("TennisCoach: Inside doMyCleanupStuff()");
	}
	
	// Define setter method for injection
	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside the setFortuneService of TennisCoach");
		this.fortuneService = fortuneService;
	}*/
	
	
	// method injection
	/*@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println("Inside the doSomeCrazyStuff of TennisCoach");
		this.fortuneService = fortuneService;
	}*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
