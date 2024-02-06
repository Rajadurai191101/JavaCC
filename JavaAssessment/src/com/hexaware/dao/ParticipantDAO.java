package com.hexaware.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.hexaware.entity.Participant;
import com.hexaware.entity.Pet;
import com.hexaware.util.DBConnection;

public class ParticipantDAO {
	Connection con;
	Statement stmt;
	PreparedStatement ps;
	ResultSet rs;
	
	public void showPart() {
		con = DBConnection.getDBConn();
		try {
			ps =con.prepareStatement("select * from participant");
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println("*******************");
				System.out.println("ParticipantId: "+rs.getInt(1));
				System.out.println("Name: "+rs.getString(2));
				System.out.println("EventId: "+rs.getInt(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void addPart(Participant part) {
		con = DBConnection.getDBConn();
		try {
			ps=con.prepareStatement("insert into participant"+"(pname,eid)"+
					"values (?,?)");
			ps.setString(1, part.getParticipantName());
			ps.setInt(2, part.getEventId());
			int noOfrows = ps.executeUpdate();
			System.out.println(noOfrows+" row inserted successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
