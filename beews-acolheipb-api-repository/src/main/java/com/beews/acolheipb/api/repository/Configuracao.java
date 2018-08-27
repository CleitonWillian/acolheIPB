package com.beews.acolheipb.api.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.beews.webstart.properties.AppProperties;
import com.beews.webstart.properties.AppPropertiesFactory;



@Configuration
public class Configuracao {
	
	@Bean
	public AppProperties appProperties() {
			return AppPropertiesFactory.getInstance();

	}


}
