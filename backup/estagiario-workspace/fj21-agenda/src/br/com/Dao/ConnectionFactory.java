package br.com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory{
	 public static Connection getConnection() {
    	 try {
    		 Class.forName("com.mysql.jdbc.Driver");
    		 return DriverManager.getConnection("jdbc:mysql://localhost/fj21", "root", "");
    	 }catch (Exception e) {
    		 throw new RuntimeException(e);
    	 }
     }
}
