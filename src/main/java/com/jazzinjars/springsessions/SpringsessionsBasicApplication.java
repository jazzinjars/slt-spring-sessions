package com.jazzinjars.springsessions;

import com.jazzinjars.springsessions.model.Weapon;
import com.jazzinjars.springsessions.model.WeaponType;
import com.jazzinjars.springsessions.session.Forge;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringsessionsBasicApplication {

	public static void main(String[] args) {

		// What are the beans?
		// What are the dependencies of a bean?
		// Where to search for a beans? => No need

		try (AnnotationConfigApplicationContext applicationContext =
			new AnnotationConfigApplicationContext(SpringsessionsBasicApplication.class);) {
			Forge forge = applicationContext.getBean(Forge.class);

			Forge forge1 = applicationContext.getBean(Forge.class);

			System.out.println(forge);
			System.out.println(forge1);

			//Forge forge = new Forge(new ElfBlacksmith());
			Weapon weapon = forge.createWeapon(WeaponType.SWORD);
			System.out.println(weapon.toString());
		}

	}

}
