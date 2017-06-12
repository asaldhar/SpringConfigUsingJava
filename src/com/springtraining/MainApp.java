package com.springtraining;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

 public static void main(String[] args) {
  
     AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
     Coach coach = (Coach) context.getBean("cricketCoach", Coach.class);
     System.out.println(coach.getDailyFortune());
     System.out.println(coach.getDailyWorkout());
     context.close();
 }

}
