package com.properties.reader;

import java.io.InputStream;
import java.util.Properties;

public class PropertiesValueReader {

	public static String getPropertiesValue(String key) {
		Properties properties = null;
		try {
			properties = new Properties();
			InputStream inputStream = PropertiesValueReader.class.getClassLoader().getResourceAsStream("externalapi.properties");
			properties.load(inputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return properties.getProperty(key.trim());
	}
}
