package com.demo.dao;

public interface LoginDao {

	String authenticationUser(String uname,String  passwd);
	void closeMyConnection();
}
