package com.jazzinjars.springsessions;

public enum WeaponType {

   SHORT_SWORD("short sword"),
   SPEAR("spear"),
   AXE("axe"),
   ELBOW("elbow"),
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
