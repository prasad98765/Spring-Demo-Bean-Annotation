package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;

public class SportConfig {
	
	@Bean
	public FortuneService happyFortuneService() {
		return new HappyFortuneService();
	}
	
	@Bean
	public Coach cricketCoach() {
		return new CricketCoach(happyFortuneService());
	}
}
