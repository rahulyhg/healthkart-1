package com.team9.healthkart.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	public static Connection getConnection()
	{
		Connection connection = null;
		
		
		 try {
			 Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/healthkart", "root", "root");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(getConnection());
	}

}
