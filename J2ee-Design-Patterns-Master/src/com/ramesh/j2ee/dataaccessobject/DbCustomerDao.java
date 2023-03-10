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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

/**
 * An implementation of {@link CustomerDao} that persists customers in RDBMS.
 *
 */
public class DbCustomerDao implements CustomerDao {

	private final DataSource dataSource;

	/**
	 * Creates an instance of {@link DbCustomerDao} which uses provided
	 * <code>dataSource</code> to store and retrieve customer information.
	 * 
	 * @param dataSource a non-null dataSource.
	 */
	public DbCustomerDao(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	private Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}

	private Customer createCustomer(ResultSet resultSet) throws SQLException {
		return new Customer(resultSet.getInt("ID"), resultSet.getString("FNAME"), resultSet.getString("LNAME"));
	}

	@Override
	public Customer getById(int id) throws Exception {
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement("SELECT * FROM CUSTOMERS WHERE ID = ?")) {

			statement.setInt(1, id);
			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				return createCustomer(resultSet);
			} else {
				return null;
			}
		} catch (SQLException ex) {
			throw new Exception(ex.getMessage(), ex);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean add(Customer customer) throws Exception {

		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement("INSERT INTO CUSTOMERS VALUES (?,?,?)")) {
			statement.setInt(1, customer.getId());
			statement.setString(2, customer.getFirstName());
			statement.setString(3, customer.getLastName());
			statement.execute();
			return true;
		} catch (SQLException ex) {
			throw new Exception(ex.getMessage(), ex);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean update(Customer customer) throws Exception {
		try (Connection connection = getConnection();
				PreparedStatement statement = connection
						.prepareStatement("UPDATE CUSTOMERS SET FNAME = ?, LNAME = ? WHERE ID = ?")) {
			statement.setString(1, customer.getFirstName());
			statement.setString(2, customer.getLastName());
			statement.setInt(3, customer.getId());
			return statement.executeUpdate() > 0;
		} catch (SQLException ex) {
			throw new Exception(ex.getMessage(), ex);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean delete(Customer customer) throws Exception {
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement("DELETE FROM CUSTOMERS WHERE ID = ?")) {
			statement.setInt(1, customer.getId());
			return statement.executeUpdate() > 0;
		} catch (SQLException ex) {
			throw new Exception(ex.getMessage(), ex);
		}
	}
}
