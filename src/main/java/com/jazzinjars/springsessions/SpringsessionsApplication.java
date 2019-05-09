package com.jazzinjars.springsessions;

import com.jazzinjars.springsessions.model.Weapon;
import com.jazzinjars.springsessions.model.WeaponType;
import com.jazzinjars.springsessions.session1.Forge;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringsessionsApplication {

	public static void main(String[] args) {

		// What are the beans?
		// What are the dependencies of a bean?
		// Where to search for a beans? => No need

		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringsessionsApplication.class, args);
		Forge forge = applicationContext.getBean(Forge.class);

		//Forge forge = new Forge(new ElfBlacksmith());
		Weapon weapon = forge.createWeapon(WeaponType.SWORD);
		System.out.println(weapon.toString());

	}

}
