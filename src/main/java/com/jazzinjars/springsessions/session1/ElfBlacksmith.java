package com.jazzinjars.springsessions.session1;

import com.jazzinjars.springsessions.model.Weapon;
import com.jazzinjars.springsessions.model.WeaponType;

public class ElfBlacksmith {

    public Weapon manufactureWeapon(WeaponType weaponType) {
        return new Weapon(weaponType);
    }
}
