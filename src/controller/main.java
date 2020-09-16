package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class main {

	public static void main(String[] args) throws NumberFormatException, IOException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		System.out.println("1.register");
		System.out.println("2.login");
		System.out.println("3. retrieve");
		int x;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		x = Integer.parseInt(br.readLine());
		
		registerpojo reg = new registerpojo();
		registerdao rdao = new registerdao();
		loginpojo lopo = new loginpojo();
		logindao ldao = new logindao();
		retrieve r = new retrieve();
		switch(x) {
		case 1: 
			System.out.println("enter fname");
			String fname = br.readLine();
			System.out.println("enter lname");
			String lname = br.readLine();
			System.out.println("enter uname");
			String uname = br.readLine();
			System.out.println("enter password");
			String password = br.readLine();
			System.out.println("enter email");
			String email = br.readLine();
			
			reg.setFname(fname);
			reg.setLname(lname);
			reg.setUname(uname);
			reg.setPassword(password);
			reg.setEmail(email);
			
			rdao.adduser(reg);
			break;
		case 2: 
			System.out.println("enter uname");
			String name = br.readLine();
			System.out.println("enter password");
			String pass = br.readLine();
			lopo.setUname(name);
			lopo.setPassword(pass);
			
			if(ldao.validate(lopo)==true) {
				Luck luck = new Luck();
				luck.display();
			}
			else {
				System.out.println("incorrect details");
			}
			break;	
		case 3:
			System.out.println("retrieve");
			
		}
	}
	

}
