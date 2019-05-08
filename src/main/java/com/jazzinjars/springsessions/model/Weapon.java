package com.jazzinjars.springsessions.model;

public class Weapon {

   WeaponType type;

   public Weapon(WeaponType type) {
      this.type = type;
      System.out.println(type.toString());
   }
}
