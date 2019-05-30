package com.jazzinjars.springsessions.cdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CastleCdiBusiness {

   @Autowired
   private CastleCdiDAO someCDIDAO;

   public CastleCdiDAO getSomeCDIDAO() {
      return someCDIDAO;
   }

   public void setSomeCDIDAO(CastleCdiDAO someCDIDAO) {
      this.someCDIDAO = someCDIDAO;
   }
}
