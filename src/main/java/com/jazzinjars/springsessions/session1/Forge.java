package com.jazzinjars.springsessions.session1;

import com.jazzinjars.springsessions.model.Weapon;
import com.jazzinjars.springsessions.model.WeaponType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Retrieve material for your Weapon
    // Select Blacksmith {Orc, Elf, Dwarf}
    // Manufacture Weapon

@Component
public class Forge {

    @Autowired
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

//    public Weapon createWeapon(WeaponType weaponType) {
//
//        ElfBlacksmith elfBlacksmith = new ElfBlacksmith();
//        Weapon weapon = elfBlacksmith.manufactureWeapon(weaponType);
//
//        return weapon;
//    }
}
