package com.jazzinjars.springsessions.xml;

public class XmlCharacterDAO {

   XmlJdbcConnection jdbcConnection;

   public XmlCharacterDAO(XmlJdbcConnection jdbcConnection) {
      this.jdbcConnection = jdbcConnection;
   }

   public XmlJdbcConnection getJdbcConnection() {
      return jdbcConnection;
   }

   public void setJdbcConnection(XmlJdbcConnection jdbcConnection) {
      this.jdbcConnection = jdbcConnection;
   }
}
