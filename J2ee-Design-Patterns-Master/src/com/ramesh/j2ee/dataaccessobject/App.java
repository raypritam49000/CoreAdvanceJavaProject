/**
 * The MIT License
 * Copyright (c) 2014-2016 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.ramesh.j2ee.dataaccessobject;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mysql.cj.jdbc.MysqlDataSource;

public class App {
	
	 private static final Logger log = LogManager.getLogger(App.class);

	public static void main(final String[] args) throws Exception {

		final CustomerDao inMemoryDao = new InMemoryCustomerDao();
		performOperationsUsing(inMemoryDao);

		final DataSource dataSource = createDataSource();
		createSchema(dataSource);

		final CustomerDao dbDao = new DbCustomerDao(dataSource);
		performOperationsUsing(dbDao);

		deleteSchema(dataSource);
		
		
	}

	private static void deleteSchema(DataSource dataSource) throws SQLException {
		try (Connection connection = dataSource.getConnection(); Statement statement = connection.createStatement()) {
			statement.execute(CustomerSchemaSql.DELETE_SCHEMA_SQL);
		}
	}

	private static void createSchema(DataSource dataSource) throws SQLException {
		try (Connection connection = dataSource.getConnection(); Statement statement = connection.createStatement()) {
			statement.execute(CustomerSchemaSql.CREATE_SCHEMA_SQL);
		}
	}

	private static DataSource createDataSource() throws Exception {
		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setDatabaseName("test");
		dataSource.setServerName("localhost");
		dataSource.setPort(3306);
		dataSource.setUser("root");
		dataSource.setPassword("1998");
		dataSource.setServerTimezone("UTC");
		dataSource.setCharacterEncoding("utf8");

		return dataSource;
	}

	private static void performOperationsUsing(final CustomerDao customerDao) throws Exception {
		addCustomers(customerDao);
		log.info("customerDao.getCustomerById(2): " + customerDao.getById(2));
		final Customer customer = new Customer(4, "Dan", "Danson");
		customerDao.add(customer);
		customer.setFirstName("Daniel");
		customer.setLastName("Danielson");
		customerDao.update(customer);
		log.info("customerDao.getAllCustomers(): ");
	}

	private static void addCustomers(CustomerDao customerDao) throws Exception {
		for (Customer customer : generateSampleCustomers()) {
			customerDao.add(customer);
		}
	}

	/**
	 * Generate customers.
	 * 
	 * @return list of customers.
	 */
	public static List<Customer> generateSampleCustomers() {
		final Customer customer1 = new Customer(1, "Adam", "Adamson");
		final Customer customer2 = new Customer(2, "Bob", "Bobson");
		final Customer customer3 = new Customer(3, "Carl", "Carlson");
		final List<Customer> customers = new ArrayList<>();
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		return customers;
	}
}
