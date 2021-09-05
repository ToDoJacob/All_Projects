package co.jacob.book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
   protected Connection conn;
   protected PreparedStatement pstmt;
   protected ResultSet rs;

   String user = "hr";
   String pass = "hr";
   String url = "jdbc:oracle:thin:@localhost:1521:xe";
   protected void connect() {
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         conn = DriverManager.getConnection(url, user, pass);
               
      } catch (ClassNotFoundException | SQLException e) {
         e.printStackTrace();
      }
      
   }
   protected void disconnect() {
      if(conn !=null) {
         try {
            conn.close();
         } catch (SQLException e) {
            e.printStackTrace();
         }
      }
   }
}