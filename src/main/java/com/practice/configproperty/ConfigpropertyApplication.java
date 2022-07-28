package com.practice.configproperty;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.practice.configproperty.beans.Festival;
import com.practice.configproperty.config.PropertyConfigIndivisualValues;
import com.practice.configproperty.config.PropertyConfigMap;

@SpringBootApplication
public class ConfigpropertyApplication implements CommandLineRunner {

	@Autowired
	private Map<String, Festival> festivals;

	public static void main(String[] args) {
		SpringApplication.run(ConfigpropertyApplication.class, "diwali", "holi");
	}

	@Autowired
	private PropertyConfigMap map;

	@Autowired
	private PropertyConfigIndivisualValues pci;

	@Override
	public void run(String... args) throws Exception {

		int size = map.getNames().size();
		System.out.println(size);

		festivals.get(args[1]).festivalFish();
	}
}
