package com.hexaware.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.hexaware.util.DBConnection;

public class EventDAO {
	Connection con;
	Statement stmt;
	PreparedStatement ps;
	ResultSet rs;
	
	public void showEvent() {
		con = DBConnection.getDBConn();
		try {
			ps =con.prepareStatement("select * from event");
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println("*******************");
				System.out.println("EventId: "+rs.getInt(1));
				System.out.println("EventName: "+rs.getString(2));
				System.out.println("EventLocation: "+rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
