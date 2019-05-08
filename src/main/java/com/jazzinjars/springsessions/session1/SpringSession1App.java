package com.jazzinjars.springsessions.session1;

import com.jazzinjars.springsessions.model.Weapon;
import com.jazzinjars.springsessions.model.WeaponType;


public class SpringSession1App {

    public static void main(String[] args) {

        Forge forge = new Forge();
        Weapon weapon = forge.createWeapon(WeaponType.SWORD);

    }
}
