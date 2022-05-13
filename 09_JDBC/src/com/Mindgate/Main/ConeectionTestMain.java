package com.Mindgate.Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConeectionTestMain {
	public static void main(String[] args) {
		System.out.println("Main Start");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 Connection connection =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mindgate123");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Failed TO Load Driver");
			System.out.println(e.getMessage());
		}
		System.out.println("Main End ");
	}
}
