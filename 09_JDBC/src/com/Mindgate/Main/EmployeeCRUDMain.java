package com.Mindgate.Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeCRUDMain {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "mindgate123";
		String driver = "oracle.jdbc.driver.OracleDriver";
		int resultcount;
		String sqlQueary;
		ResultSet resultset;

		Connection connection;
		// Statement statement;
		PreparedStatement preparedStatement;

//		try {
//			Class.forName(driver);
//			connection = DriverManager.getConnection(url, user, password);
//			statement = connection.createStatement();
//			sqlQueary = "SELECT * FROM employee_details";
//			resultset = statement.executeQuery(sqlQueary);
//
//			while (resultset.next()) {
//				System.out.println(resultset.getInt("employee_id"));
//				System.out.println(resultset.getString("name"));
//				System.out.println(resultset.getDouble("salary"));
//			}
//
//			
//			
//			connection.close();
//		} catch (ClassNotFoundException | SQLException e) {
//			System.out.println("Exception");
//			System.out.println(e.getMessage());
//		}

//		try {
//			Class.forName(driver);
//			connection = DriverManager.getConnection(url, user, password);
//			statement = connection.createStatement();
//			sqlQueary = "DELETE employee_details WHERE eployee_id = 3 ";
//			resultcount = statement.executeUpdate(sqlQueary);
//			if (resultcount > 0)
//				System.out.println("Delete Succesful");
//			else
//				System.out.println("Delete Failed");
//		} catch (ClassNotFoundException | SQLException e) {
//			System.out.println(e.getMessage());
//		}

//		try {
//			Class.forName(driver);
//			connection = DriverManager.getConnection(url, user, password);
//			statement = connection.createStatement();
//			sqlQueary = "UPDATE employee_details SET name = 'Nitesh Subhedar' , salary = 5000 WHERE employee_id = 2 ";
//			resultcount = statement.executeUpdate(sqlQueary);
//
//			if (resultcount > 0) {
//				System.out.println("Update Successful");
//			} else {
//				System.out.println("Update Failed");
//			}
//		} catch (ClassNotFoundException | SQLException e) {
//			System.out.println(e.getMessage());
//		}

		// Useing preparedStament
//		System.out.println("Insert Example ");
//
//		try {
//			Class.forName(driver);
//			connection = DriverManager.getConnection(url, user, password);
//			sqlQueary = "INSERT INTO employee_details VALUES (?,?)";
//
//			preparedStatement = connection.prepareStatement(sqlQueary);
//			preparedStatement.setString(1, "Chaitanya");
//			preparedStatement.setDouble(2, 12000);
//			resultcount = preparedStatement.executeUpdate();
//			if (resultcount > 0)
//				System.out.println("Recored  insert Successfully");
//			else
//				System.out.println("unable to inserted ");
//		} catch (ClassNotFoundException | SQLException e) {
//			System.out.println("Exception");
//			System.out.println(e.getMessage());
//
//		}

//		try {
//			Class.forName(driver);
//			connection = DriverManager.getConnection(url, user, password);
//			sqlQueary = "UPDATE employee_details Set name = ? ,salary = ? WHERE employee_id =? ";
//			preparedStatement = connection.prepareStatement(sqlQueary);
//			preparedStatement.setString(1, "Raj");
//			preparedStatement.setDouble(2, 34000);
//			preparedStatement.setInt(3, 3);
//			resultcount = preparedStatement.executeUpdate();
//
//			if (resultcount > 0)
//				System.out.println("Update Successful");
//			else
//				System.out.println("Update Failed ");

		// connection.close();
//		} catch (ClassNotFoundException | SQLException e) {
//			System.out.println("Exception");
//			System.out.println(e.getMessage());
//		}

		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, password);
			sqlQueary = "DELETE employee_details WHERE employee_id = ?";
			preparedStatement = connection.prepareStatement(sqlQueary);
			preparedStatement.setInt(1, 2);
			resultcount = preparedStatement.executeUpdate();
			if (resultcount > 0)
				System.out.println("Delete Successful");
			else
				System.out.println("Delete Failed ");
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Exception");
			System.out.println(e.getMessage());
		}
	}
}
