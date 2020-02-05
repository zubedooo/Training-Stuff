package com.zubin.connection;

import java.sql.*;

public class GetConnection {
	
	//all variables WRT connection goes here
	static Connection connection;
	public PreparedStatement ps,ps1,ps2;
	public ResultSet rs1,rs2;
	
	public static Connection getPostGresConnection() {
		
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/zubdb","postgres","");
			
			return connection; 
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
