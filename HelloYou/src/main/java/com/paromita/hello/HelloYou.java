package com.paromita.hello;

import com.paromita.person.Person;

public class HelloYou {
	
	private Person you;

	public Person getYou() {
		return you;
	}

	public void setYou(Person you) {
		this.you = you;
	}
	
	public void sayHello(){
		System.out.println("Hello " + you.getName() + " !");
	}

}
