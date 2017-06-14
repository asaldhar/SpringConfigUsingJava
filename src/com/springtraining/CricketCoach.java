package com.springtraining;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach
{
    private FortuneService fortuneService;

    @Value("${foo.email}")
    private String email;
    
    public FortuneService getFortuneService()
    {
        return fortuneService;
    }

    @Value("${foo.team}")
    private String team;
    
    public String getEmail()
    {
        return email;
    }

    public String getTeam()
    {
        return team;
    }

    @Autowired
    public CricketCoach(FortuneService fortuneService)
    {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout()
    {
        return "Run for 10 mins";
    }

    @Override
    public String getDailyFortune()
    {
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
