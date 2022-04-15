package com.practice.configproperty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.practice.configproperty.config.PropertyConfigMap;

@SpringBootApplication
public class ConfigpropertyApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ConfigpropertyApplication.class, args);
	}

	@Autowired
	private PropertyConfigMap map;
	
	@Override
	public void run(String... args) throws Exception {

		int size = map.getNames().size();
		System.out.println(size);
	}

}
