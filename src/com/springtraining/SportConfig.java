package com.springtraining;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.springtraining")
@PropertySource("classpath:sport.properties")
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
    public Coach cricketCoach(HappyFortuneService fortuneService)
    {
        CricketCoach cricketCoach = new CricketCoach(happyFortuneService());
        
        return cricketCoach;
    }
    
}
