package com.project.realestate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TenantDA {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String url="jdbc:mysql://localhost/realestate";
	String user="root";
	String pass="abu420";
//	String loginStatement="SELECT * FROM users WHERE email=? OR userName=? AND password=?";
	String createuser="INSERT INTO tenant(name,presentAddress,permanentAddress,phoneNo,email,occupation,propertyId) VALUES(?,?,?,?,?,?,?)";
	
	
	public Tenant create(Tenant u) {
//		Users users=null;
		try {
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(createuser);
			ps.setString(1, u.getName());
			ps.setString(2, u.getPresentAddress());
			ps.setString(3, u.getPermanentAddress());
			ps.setString(4, u.getPhoneNo());
			ps.setString(5, u.getEmail());
			ps.setString(6, u.getOcupation());
			ps.setString(7, u.getPropertyId());
			ps.executeUpdate();
			
		}catch(Exception e) {
			
		}

		return u;
	}

}
