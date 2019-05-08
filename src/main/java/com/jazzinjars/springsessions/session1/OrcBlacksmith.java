package com.jazzinjars.springsessions.session1;

import com.jazzinjars.springsessions.model.Weapon;
import com.jazzinjars.springsessions.model.WeaponType;

public class OrcBlacksmith {

    public Weapon manufactureWeapon(WeaponType weaponType) {
        return new Weapon(weaponType);
    }
}
