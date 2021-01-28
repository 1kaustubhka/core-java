package com.cybage;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCExample {
	public void selectRecord() throws Exception {
		//1.Load Database
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2. Connect to actual database using MySQL driver
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cyb","root","cyabge@123");
		
		//3. Talk to db using conn object
		java.sql.Statement statement = conn.createStatement();
		ResultSet result= statement.executeQuery("select * from emp");
		
		result.next();
		System.out.println(result.getInt(0)+" "+result.getString(1));
		
		result.close();
		statement.close();
		conn.close();
	}
	
	public void addRecord() throws Exception{
Class.forName("com.mysql.jdbc.Driver");
		
		//2. Connect to actual database using MySQL driver
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cyb","root","cyabge@123");
		
		PreparedStatement ps = conn.prepareStatement("insert into emp values(?,?,?)");
	
		
	}
}
