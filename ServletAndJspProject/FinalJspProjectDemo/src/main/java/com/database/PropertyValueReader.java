package com.database;

import java.io.InputStream;
import java.util.Properties;

public class PropertyValueReader {

	public static String getValue(String key) {
		Properties properties = new Properties();
		try 
		{
			InputStream inputStream = PropertyValueReader.class.getClassLoader().getResourceAsStream("db.properties");
			properties.load(inputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return properties.getProperty(key);
	}
	
	public static void main(String[] args) {
		System.out.println(PropertyValueReader.getValue("db.driver"));
	}
}
