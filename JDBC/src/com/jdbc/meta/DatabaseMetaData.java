package com.jdbc.meta;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.ResultSet;

public class DatabaseMetaData {
	
	public static void main(String args[]){  
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		  
		Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/kelvin","root","hagrid123");  
		  
		java.sql.DatabaseMetaData dbmd=con.getMetaData();  
		  
		System.out.println("Driver Name: "+dbmd.getDriverName());  
		System.out.println("Driver Version: "+dbmd.getDriverVersion());  
		System.out.println("UserName: "+dbmd.getUserName());  
		System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());  
		System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());  
		String table[]={"TABLE"};  
		java.sql.ResultSet rs=dbmd.getTables(null,null,null,table);  
		  
		while(rs.next()){  
		System.out.println(rs.getString(3));  
		}    
		con.close();  
		  
		}catch(Exception e){ System.out.println(e);}  
		  
		}  

}
