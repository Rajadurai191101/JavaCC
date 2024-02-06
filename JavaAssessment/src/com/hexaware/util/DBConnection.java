package com.hexaware.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	static Connection con;
	
	public static Connection getDBConn() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petpal", "root", "Anburaja45");
		} catch (SQLException e) {
			System.out.println("DBConnection Excption");
			e.printStackTrace();
		}
		return con;
	}
	public static void main(String[] args) {
		System.out.println(getDBConn());

	}

}
