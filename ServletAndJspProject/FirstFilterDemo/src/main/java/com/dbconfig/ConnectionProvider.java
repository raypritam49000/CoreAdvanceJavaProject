package com.dbconfig;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	public static Connection conn = null;

	public static Connection getConnection() {
		try {
			if (conn == null) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "1998");
				return conn;
			}

			return conn;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void main(String[] args) {
		System.out.println(getConnection());
	}
}
