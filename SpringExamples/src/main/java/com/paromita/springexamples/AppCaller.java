package com.paromita.springexamples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AppCaller {
	public static void main(String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringConfig.xml");
 
		PersonName obj = (PersonName) context.getBean("personName");
		System.out.println("My Name is " + obj.getAppRef().getMsg());
	}

}
