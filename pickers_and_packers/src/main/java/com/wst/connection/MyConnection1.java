package com.wst.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection1 {
    public static Connection getMyConn()
	{
	  
	  try {
		Class.forName("org.postgresql.Driver");
	} catch (ClassNotFoundException e) {
		System.out.println("Where is your MySQL JDBC Driver?");
		System.out.println(e);
		return null;
	}

	System.out.println("MySQL JDBC Driver Registered!");
	Connection connection = null;

	try {
		connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","nidhi");

	} catch (SQLException e) {
		System.out.println("Connection Failed! Check output console");
		System.out.println(e);
		return null;
	}

	if (connection != null) {
		System.out.println("You made it, take control your database now!");
		//System.out.println(connection);
		return connection;
	} else {
		System.out.println("Failed to make connection!");
	}
         return null;
}
    public static void main(String[] args) {
       System.out.println(getMyConn());
    }
}
    

