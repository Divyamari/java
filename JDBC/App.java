package com;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//register mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//get mysql db connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/c123", "root" , "Dilips@123");
			
			//create statement
			Statement stmt = conn.createStatement();
			
			stmt.executeUpdate("insert into customer values(7,'divya','8546215')");
				System.out.println("inserted succesfully");
			//close mysql db connection
			conn.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
