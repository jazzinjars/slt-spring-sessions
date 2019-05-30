package com.jazzinjars.springsessions.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CharacterDAO {

   @Autowired
   JdbcConnection jdbcConnection;

   public CharacterDAO(JdbcConnection jdbcConnection) {
      this.jdbcConnection = jdbcConnection;
   }

   public JdbcConnection getJdbcConnection() {
      return jdbcConnection;
   }

   public void setJdbcConnection(JdbcConnection jdbcConnection) {
      this.jdbcConnection = jdbcConnection;
   }
}
