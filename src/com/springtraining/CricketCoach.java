package com.springtraining;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
	
	public FortuneService fortuneService;
	
	@Autowired
	public CricketCoach(FortuneService fortuneService)
	{
	    this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run for 10 mins";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	@PostConstruct
	public void doMyStartUpStuff()
	{
	    System.out.println("Starting up the bean for you");
	}
	
	@PreDestroy
	public void doMyCleanUpStuff()
	{
	    System.out.println("Cleaning up the bean for you");
	}

}
