package com.jazzinjars.springsessions;

import com.jazzinjars.springsessions.cdi.CastleCdiBusiness;
import com.jazzinjars.springsessions.scope.CharacterDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringsessionsCdiApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringsessionsCdiApplication.class);

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringsessionsCdiApplication.class, args);
		CastleCdiBusiness castleCdiBusiness = applicationContext.getBean(CastleCdiBusiness.class);

		LOGGER.info("{} dao-{}", castleCdiBusiness, castleCdiBusiness.getSomeCDIDAO());
	}

}
