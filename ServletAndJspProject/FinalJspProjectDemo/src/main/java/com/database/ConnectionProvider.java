package com.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	public static Connection connection = null;

	public static Connection getConnection() {
		if (connection == null) {
			try {
				Class.forName(DBINFO.DRIVER);
				connection = DriverManager.getConnection(DBINFO.URL, DBINFO.USERNAME, DBINFO.PASSWORD);
				return connection;
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			return connection;
		}
		return connection;
	}

}
