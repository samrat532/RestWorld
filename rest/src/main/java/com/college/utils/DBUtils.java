package com.college.utils;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtils {

	private Connection connection;
	private DriverManager driverManager;
	private Driver driver;
	private String URL = "jdbc:mysql://localhost:3306/college";
	private String username = "root";
	private String password = "root";

	@SuppressWarnings("static-access")
	public Connection getDBConnection() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = driverManager.getConnection(URL, username, password);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

	public static void main(String[] args) throws Exception {
		DBUtils dbutils = new DBUtils();
		Connection newConn = dbutils.getDBConnection();
		Statement stmt = newConn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from college");

		while (rs.next())
			System.out.println(rs.getInt(1) + "  " + rs.getString(2));

	}

}
