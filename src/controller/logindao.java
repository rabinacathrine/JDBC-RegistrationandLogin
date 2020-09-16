package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class logindao {

	public boolean validate(loginpojo lopo) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String uname=lopo.getUname();
		String password=lopo.getPassword();
		
		connectionmanager con = new connectionmanager();
		Statement st = con.getconection().createStatement();
		
		ResultSet rs = st.executeQuery("SELECT * FROM USERDETAILS");
		
		while(rs.next()) {
			if(uname.contentEquals(rs.getString("UNAME"))&& password.equals("PASSWORD")){
				con.getconection().close();
			}
			else {
				con.getconection().close();
				
			}
		}
		return true;
		
	}

	
}
