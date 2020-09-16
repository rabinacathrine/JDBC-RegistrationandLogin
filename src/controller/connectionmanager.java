package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionmanager {
public Connection getconection() throws SQLException, ClassNotFoundException {
	Class.forName("oracle.jdbc.OracleDriver");
	
	Connection con = null;
 con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
 if(con!=null) {
	 System.out.println("established");
	
 }
return con;
}
}
