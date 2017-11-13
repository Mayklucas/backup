package br.co.jdbc.modelo;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

import com.mysql.jdbc.Connection;

import Dao.ConnectionFactory;

public class JDBCInsere {

	public static void main(String[] args) throws SQLException {
		
    Connection con = (Connection) new ConnectionFactory().getConnection();
    
    String sql = "insert into contatos" + "(nome,email,endereco,dataNascimento)" +  "values (?,?,?,?)";
    PreparedStatement stmt = con.prepareStatement(sql);
    
    stmt.setString(1, "Mayk");
    stmt.setString(2, "mayklucas2015@gmail.com");
    stmt.setString(3, "Rua casa do lado");
    stmt.setDate(4, new java.sql.Date(Calendar.getInstance().getTimeInMillis()));
    
    stmt.execute();
    stmt.close();
    
    System.out.println("gravado!");
    
    con.close();
	}

}