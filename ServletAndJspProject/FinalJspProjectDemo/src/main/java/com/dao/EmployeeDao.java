package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.database.ConnectionProvider;
import com.model.Employee;

public class EmployeeDao {

	public static boolean registerUser(Employee employee) {
		try {
			String sql = "insert into register(name,city,salary) values(?,?,?)";
			Connection connection = ConnectionProvider.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, employee.getName());
			preparedStatement.setString(2, employee.getCity());
			preparedStatement.setString(3, employee.getSalary());

			int result = preparedStatement.executeUpdate();

			if (result > 0) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
