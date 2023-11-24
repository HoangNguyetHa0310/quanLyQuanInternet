/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaodien;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author PC
 */
public class sqliteConnection {
	   
	Connection con = null;

    String url = "jdbc:mysql://localhost:3306/qlquannet";
    String username = "root";
    String password = " ";

    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection(url, username, password);

      System.out.println("Connected!");

    } catch (SQLException ex) {
        throw new Error("Error ", ex);
    } finally {
      try {
        if (con != null) {
            con.close();
        }
      } catch (SQLException ex) {
          System.out.println(ex.getMessage());
      }
    }
}
}