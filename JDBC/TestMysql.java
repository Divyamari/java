package com;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class TestMysql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//register mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//get mysql db connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/c123", "root" , "Dilips@123");
			
			//create statement
			Statement stmt = conn.createStatement();
			
			//execute Query, fetch data from DB table
			ResultSet rs =   stmt.executeQuery("select * from c123.customer");
			
			//iteration
			while(rs.next())
				System.out.println("Customer id : "+rs.getInt(1) + " " + "Customer name : "+rs.getString(2) + " " + "Customer phone : " +rs.getString(3));
			
			//close mysql db connection
			conn.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
