package com.prince;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBInsertOperation {
	

	public static void main(String[] args) throws Exception {
		
		
		//Driver Loading
		Class.forName("com.mysql.jdbc.Driver");
		//Establish Connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/student","root","");
		//Creating Statement
		Statement smt = conn.createStatement();
		//Executing Statement
		String sql="INSERT INTO studen (id, name, city) VALUES (4,'raj','banglor');";
		smt.execute(sql);
	
		
		//Close the connection
		conn.close();
		
	}


}
