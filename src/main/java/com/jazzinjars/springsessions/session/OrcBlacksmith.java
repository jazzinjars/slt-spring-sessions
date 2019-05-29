package com.jazzinjars.springsessions.session;

import com.jazzinjars.springsessions.model.Weapon;
import com.jazzinjars.springsessions.model.WeaponType;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("orc")
public class OrcBlacksmith implements Blacksmith {
    public Weapon manufactureWeapon(WeaponType weaponType) {
        return new Weapon(weaponType);
    }
}
