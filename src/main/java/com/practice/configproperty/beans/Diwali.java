package com.practice.configproperty.beans;

import org.springframework.stereotype.Component;

@Component
public class Diwali implements Festival {

	@Override
	public void festivalFish() {
		System.out.println("Happy Diwali");
	}

}
