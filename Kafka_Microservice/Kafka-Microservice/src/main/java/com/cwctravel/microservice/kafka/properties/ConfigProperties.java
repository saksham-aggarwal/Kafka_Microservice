package com.cwctravel.microservice.kafka.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:application.properties")
public class ConfigProperties {

	@Autowired
	private Environment env;

	public String getConfigValue(String configKey) {
		return env.getProperty(configKey);
	}
}
