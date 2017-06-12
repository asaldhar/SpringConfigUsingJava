package com.springtraining;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springtraining")
public class SportConfig
{
    @Bean
    public HappyFortuneService happyFortuneService()
    {
        return new HappyFortuneService();
    }
    @Bean
    public RandomService randomService()
    {
        return new RandomService();
    }
    
    @Bean
    public Coach cricketCoach(RandomService fortuneService)
    {
        CricketCoach cricketCoach = new CricketCoach(randomService());
        
        return cricketCoach;
    }
    
}
