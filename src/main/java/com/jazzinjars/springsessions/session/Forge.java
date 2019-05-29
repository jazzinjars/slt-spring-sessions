package com.jazzinjars.springsessions.session;

import com.jazzinjars.springsessions.model.Weapon;
import com.jazzinjars.springsessions.model.WeaponType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// Retrieve material for your Weapon
    // Select Blacksmith {Orc, Elf, Dwarf}
    // Manufacture Weapon

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Forge {

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

}
