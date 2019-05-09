package com.jazzinjars.springsessions.session1;

import com.jazzinjars.springsessions.model.Weapon;
import com.jazzinjars.springsessions.model.WeaponType;

public interface Blacksmith {
   Weapon manufactureWeapon(WeaponType weaponType);
}
