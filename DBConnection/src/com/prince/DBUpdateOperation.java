package com.prince;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBUpdateOperation {
	

	public static void main(String[] args) throws Exception {
		
		
		//Driver Loading
		Class.forName("com.mysql.jdbc.Driver");
		//Establish Connection
		//student is database name in url 
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/student","root","");
		//Creating Statement
		Statement smt = conn.createStatement();
		//Executing Statement
		
		//studen is table name in query and name ,id and city are column name
		String sql="UPDATE studen\r\n" + 
				"SET name = 'Alfred Schmidt', city= 'Frankfurt'\r\n" + 
				"WHERE id = 2;";
		smt.execute(sql);
	
		
		//Close the connection
		conn.close();
		
	}


}
