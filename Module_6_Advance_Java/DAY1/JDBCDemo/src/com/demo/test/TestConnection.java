package com.demo.test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url="jdbc:mysql://localhost:3306/first?useSSL=false&allowPublicKeyRetrieval=true";
			Connection conn=DriverManager.getConnection(url, "root", "root");
			if(conn!=null)
			{
				System.out.println("Connection Done");
			}
			else
			{
				System.out.println("Connection Failed");
			}
			conn.close();
		} catch (SQLException e) {
			
			System.out.println("connection not done");
			e.printStackTrace();
		}

	}

}
