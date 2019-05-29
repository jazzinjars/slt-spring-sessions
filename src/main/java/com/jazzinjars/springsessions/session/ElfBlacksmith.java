package com.jazzinjars.springsessions.session;

import com.jazzinjars.springsessions.model.Weapon;
import com.jazzinjars.springsessions.model.WeaponType;
import org.springframework.stereotype.Component;

@Component
public class ElfBlacksmith implements Blacksmith {
    public Weapon manufactureWeapon(WeaponType weaponType) {
        return new Weapon(weaponType);
    }
}
