package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class registerdao {
	public void adduser(registerpojo reg) throws ClassNotFoundException, SQLException {
		String fname=reg.getFname();
		String lname = reg.getLname();
		String uname = reg.getUname();
		String password=reg.getPassword();
		String email = reg.getEmail();
		
		connectionmanager cm = new connectionmanager();
		
		//insert
		String sql = "INSERT INTO USERDETAILS (FNAME, LNAME, UNAME,PASSWORD,EMAIL)VALUES(?,?,?,?,?)";
	//create statement
		PreparedStatement st = cm.getconection().prepareStatement(sql);
		st.setString(1, fname);
		st.setString(2, lname);
		st.setString(3, uname);
		st.setString(4, password);
		st.setString(5, email);
		
//execute
		st.executeUpdate();
		cm.getconection().close();
		
	}

}
