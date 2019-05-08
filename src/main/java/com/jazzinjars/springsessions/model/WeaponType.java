package com.jazzinjars.springsessions.model;

public enum WeaponType {

   SWORD("Sword"),
   SPEAR("Spear"),
   AXE("Axe"),
   ELBOW("Elbow"),
   UNDEFINED("");

   private String title;

   WeaponType(String title) {
      this.title = title;
   }

   @Override
   public String toString() {
      return title;
   }
}
