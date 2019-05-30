package com.jazzinjars.springsessions;

import com.jazzinjars.springsessions.xml.XmlCharacterDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringsessionsXMLContextApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringsessionsXMLContextApplication.class);

	public static void main(String[] args) {

		// What are the beans?
		// What are the dependencies of a bean?
		// Where to search for a beans? => No need

		try (ClassPathXmlApplicationContext applicationContext =
			new ClassPathXmlApplicationContext("applicationContext.xml")) {

			LOGGER.info("Beans Loaded -> {}", (Object)applicationContext.getBeanDefinitionNames());
			XmlCharacterDAO xmlCharacterDAO = applicationContext.getBean(XmlCharacterDAO.class);
			LOGGER.info("{} - {}", xmlCharacterDAO, xmlCharacterDAO.getXmlJdbcConnection());
		}

	}

}
