package com.sidharth.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create an array of strings
	private String[] data={
			"Beware of the wolf in the sheep's clothing",
			"Delegence is the mother od good luck",
			"the journey is the reward"
	};
	
	//create a random number generator
	private Random myRandom=new Random();
	
	@Override
	public String getFortune() {
		//pick up a random string from the array
		int index=myRandom.nextInt(data.length);
		
		String theFortune=data[index];
		
		return theFortune;
	}

}
