package com.jazzinjars.springsessions.session;

import com.jazzinjars.springsessions.model.Weapon;
import com.jazzinjars.springsessions.model.WeaponType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// Retrieve material for your Weapon
    // Select Blacksmith {Orc, Elf, Dwarf}
    // Manufacture Weapon

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Forge {
    private Logger logger = LoggerFactory.getLogger(Forge.class);

    @Autowired
    @Qualifier("orc")
    private Blacksmith blacksmith;

    public Forge(Blacksmith blacksmith) {
        super();
        this.blacksmith = blacksmith;
    }

    public Weapon createWeapon(WeaponType weaponType) {

        Weapon weapon = blacksmith.manufactureWeapon(weaponType);
        System.out.println(blacksmith);

        return weapon;
    }

    @PostConstruct
    public void postConstruct() {
        logger.info("POST-CONSTRUCT");
    }

    @PreDestroy
    public void preDestroy() {
        logger.info("PRE-DESTROY");
    }

}
