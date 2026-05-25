package com.demo.dao;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;

public class DBUtil {
	static Connection conn;
	public static  Connection getMyConnection()
	{
		if(conn==null)
	{
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url="jdbc:mysql://localhost:3306/first?useSSL=false&allowPublicKeyRetrieval=true";
			conn=DriverManager.getConnection(url,"root","root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		return conn;
	}
	
	public static void closeMyConnection()
	{
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
