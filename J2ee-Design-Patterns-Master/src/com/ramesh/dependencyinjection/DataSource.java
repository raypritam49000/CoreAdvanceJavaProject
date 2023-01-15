package com.ramesh.dependencyinjection;

import java.sql.Connection;

/**
 * Datasource interface
 *
 */
public interface DataSource {
	public void createConnection(DatabaseConfig config);
	public Connection getConnection();
	
}
