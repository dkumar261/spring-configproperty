package com.practice.configproperty.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;



@Setter
@Getter
@Configuration
@ConfigurationProperties(prefix = "nab")
public class PropertyConfigIndivisualValues {

	private String laptop;
	private String windowName;
	private String mobile;
	
}
