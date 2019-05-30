package com.jazzinjars.springsessions;

import com.jazzinjars.componentscan.ComponentDAO;
import com.jazzinjars.springsessions.scope.CharacterDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.jazzinjars.componentscan")
public class SpringsessionsComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringsessionsComponentScanApplication.class);

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringsessionsComponentScanApplication.class, args);
		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

		LOGGER.info("{}", componentDAO);
	}

}
