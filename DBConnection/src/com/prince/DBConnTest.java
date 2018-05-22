package com.prince;

import java.sql.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnTest {
	
	
	public static void main(String[] args) throws Exception {
		
		
		//Driver Loading
		Class.forName("com.mysql.jdbc.Driver");
		//Establish Connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/student","root","");
		//Creating Statement
		Statement smt = conn.createStatement();
		//Executing Statement
		String sql="select * from studen";
		ResultSet rs = smt.executeQuery(sql);
		//Resultset
		while(rs.next())
		{
			
			System.out.println(rs.getString(1)+" "+rs.getString(2)+rs.getString(3));	
		
		}
		//Close the connection
		conn.close();
		
	}

}
