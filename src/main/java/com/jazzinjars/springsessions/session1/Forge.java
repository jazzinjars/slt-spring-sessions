package com.jazzinjars.springsessions.session1;

import com.jazzinjars.springsessions.model.Weapon;
import com.jazzinjars.springsessions.model.WeaponType;

    // Retrieve material for your Weapon
    // Select Blacksmith {Orc, Elf, Dwarf}
    // Manufacture Weapon

public class Forge {

    public Weapon createWeapon(WeaponType weaponType) {

        ElfBlacksmith elfBlacksmith = new ElfBlacksmith();
        Weapon weapon = elfBlacksmith.manufactureWeapon(weaponType);

        return weapon;
    }
}
