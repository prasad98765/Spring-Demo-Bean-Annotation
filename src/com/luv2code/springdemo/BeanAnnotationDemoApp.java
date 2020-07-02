package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanAnnotationDemoApp {

	public static void main(String[] args) {
		// load the  java spring configuration file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// retrieve bean from spring container
		Coach theCoach = context.getBean("cricketCoach", Coach.class);

		// call methods on the bean
		System.out.println(theCoach.getDailyWorkOut());

		// call method to get daily fortune
		
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
	}

}
