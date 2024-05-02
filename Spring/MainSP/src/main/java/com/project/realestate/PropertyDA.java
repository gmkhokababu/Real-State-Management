package com.project.realestate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PropertyDA {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String url="jdbc:mysql://localhost/realestate";
	String user="root";
	String pass="abu420";
	String insert="insert into property values(?,?,?,?,?,?,?)";
	String show="select * from property";
	
	public Property save(Property p) {
		
		try {
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(insert);
			ps.setInt(1, p.getId());
			ps.setString(2, p.getType());
			ps.setString(3, p.getLocation());
			ps.setInt(4, p.getSize());
			ps.setString(5, p.getAmenities());
			ps.setString(6, p.getStatus());
			ps.setInt(7, p.getLandlordId());
			ps.executeUpdate();
			con.close();
		}catch(Exception e) {
			
		}
		return p;
	}
	
	public List<Property> allproperty(){
		List<Property> property=new ArrayList<>();
		try {
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(show);
			rs=ps.executeQuery();
			while(rs.next()) {
				property.add( new Property(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getInt(7)));
			}
		}catch(Exception e) {
			
		}
		
		return property;
	}

}
