package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class update {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/c123", "root" , "Dilips@123");
			
			Statement stmt = conn.createStatement();
			
			//update an existing record
			stmt.executeUpdate("update customer set customerphone = '84569224' where customerid = '2' ");
			System.out.println("update successfully");
			
			//delete record
		//	stmt.executeUpdate("delete from customer where customerid = '5' ");
		//	System.out.println("record deleted");
			
			//execute Query,fetch data from DB table
		//	ResultSet rs = stmt.executeQuery("select * from customer order by customername");
			
			//iteration
	//		while(rs.next())
	//			System.out.println("Customer id : "+rs.getInt(1) + " " + "Customer name : "+rs.getString(2) + " " + "Customer phone : " +rs.getString(3));
			
			conn.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
			
	}

}
