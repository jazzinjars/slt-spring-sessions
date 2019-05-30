package com.jazzinjars.springsessions;

import com.jazzinjars.springsessions.scope.CharacterDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringsessionsScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringsessionsScopeApplication.class);

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringsessionsScopeApplication.class, args);
		CharacterDAO characterDAO = applicationContext.getBean(CharacterDAO.class);
		CharacterDAO characterDAO2 = applicationContext.getBean(CharacterDAO.class);

		LOGGER.info("{}", characterDAO.getJdbcConnection());
		LOGGER.info("{}", characterDAO2.getJdbcConnection());

		LOGGER.info("{}", characterDAO);
		LOGGER.info("{}", characterDAO2);
	}

}
