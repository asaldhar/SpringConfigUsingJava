package com.springtraining;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService
{

    @Override
    public String getFortune()
    {
        return "You are in Random Service!";
    }

}
