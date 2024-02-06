package com.hexaware.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.hexaware.entity.Pet;
import com.hexaware.util.DBConnection;

public class PetShelterDAO {
	
	Connection con;
	Statement stmt;
	PreparedStatement ps;
	ResultSet rs;
	
	public void listPet() {
		con = DBConnection.getDBConn();
		try {
			ps =con.prepareStatement("select * from pet");
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println("*******************");
				System.out.println("PetId: "+rs.getInt(1));
				System.out.println("Name: "+rs.getString(2));
				System.out.println("Age: "+rs.getInt(3));
				System.out.println("Breed: "+rs.getString(4));
				System.out.println("Color: "+rs.getString(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void addPet(Pet pet) {
		con = DBConnection.getDBConn();
		try {
			ps=con.prepareStatement("insert into pet"+"(petName,petAge,petBreed,petColor)"+
					"values (?,?,?,?)");
			ps.setString(1, pet.getName());
			ps.setInt(2, pet.getAge());
			ps.setString(3, pet.getBreed());
			ps.setString(4, pet.getColor());
			int noOfrows = ps.executeUpdate();
			System.out.println(noOfrows+" row inserted successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void removePet(int petId) {
		try {
			con = DBConnection.getDBConn();
			ps=con.prepareStatement("delete from pet where petId=?");
			ps.setInt(1, petId);
			
			int noofrows = ps.executeUpdate();
			System.out.println(noofrows + " deleted Successfully !!!" );
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
}
