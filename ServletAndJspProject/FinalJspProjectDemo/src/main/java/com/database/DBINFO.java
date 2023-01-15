package com.database;

public interface DBINFO {
	public static final String DRIVER = PropertyValueReader.getValue("db.driver");
	public static final String URL = PropertyValueReader.getValue("db.url");
	public static final String USERNAME = PropertyValueReader.getValue("db.username");
	public static final String PASSWORD = PropertyValueReader.getValue("db.password");
}
