package com.jazzinjars.springsessions;

import com.jazzinjars.springsessions.properties.ExternalService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
//app.properties
@PropertySource("classpath:app.properties")
public class SpringsessionsPropertiesApplication {

	public static void main(String[] args) {

		// What are the beans?
		// What are the dependencies of a bean?
		// Where to search for a beans? => No need

		try (AnnotationConfigApplicationContext applicationContext =
			new AnnotationConfigApplicationContext(SpringsessionsPropertiesApplication.class);) {
			ExternalService externalService = applicationContext.getBean(ExternalService.class);

			System.out.println(externalService.returnServiceURL());
		}

	}

}
