package com.prince;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBDeleteOperation {
	
	public static void main(String[] args) throws Exception {
		
		
		//Driver Loading
		Class.forName("com.mysql.jdbc.Driver");
		//Establish Connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/student","root","");
		//Creating Statement
		Statement smt = conn.createStatement();
		//Executing Statement
		String sql="DELETE FROM studen WHERE name='raj';";
		smt.execute(sql);
	
		
		//Close the connection
		conn.close();
		
	}
	

}
