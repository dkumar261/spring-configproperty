package com.practice.configproperty.beans;

import org.springframework.stereotype.Component;

@Component
public class Holi implements Festival{

	@Override
	public void festivalFish() {
		System.out.println("Happy Holi");
	}

}
