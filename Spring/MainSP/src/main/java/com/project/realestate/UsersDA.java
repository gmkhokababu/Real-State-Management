package com.project.realestate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsersDA {
	
	
	//------------------Login----------------
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String url="jdbc:mysql://localhost/realestate";
	String user="root";
	String pass="abu420";
	String loginStatement="SELECT * FROM users WHERE email=? OR user_name=? AND password=?";
	
	public Users login(String userName, String password) {
		Users users=null;
		try {
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(loginStatement);
			ps.setString(1, userName);
			ps.setString(2, userName);
			ps.setString(3, password);
			rs=ps.executeQuery();
			while(rs.next()) {
				users=new Users(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
			}
		}catch(Exception e) {
			
		}

		return users;
	}

}
