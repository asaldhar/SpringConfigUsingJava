package com.springtraining;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

 public static void main(String[] args) {
  
     AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
     CricketCoach coach = (CricketCoach) context.getBean("cricketCoach", Coach.class);
     System.out.println(coach.getDailyFortune());
     System.out.println(coach.getDailyWorkout());
     System.out.println(coach.getEmail());
     System.out.println(coach.getTeam());
     context.close();
 }

}
