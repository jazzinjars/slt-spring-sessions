package com.jazzinjars.springsessions.xml;

public class XmlCharacterDAO {

   XmlJdbcConnection xmlJdbcConnection;

   public XmlCharacterDAO() {

   }

   public XmlCharacterDAO(XmlJdbcConnection jdbcConnection) {
      this.xmlJdbcConnection = xmlJdbcConnection;
   }

   public XmlJdbcConnection getXmlJdbcConnection() {
      return xmlJdbcConnection;
   }

   public void setXmlJdbcConnection(XmlJdbcConnection xmlJdbcConnection) {
      this.xmlJdbcConnection = xmlJdbcConnection;
   }
}
