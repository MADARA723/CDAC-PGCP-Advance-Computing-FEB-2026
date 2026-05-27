package com.demo.service;

public interface LoginService {
	
	String ValidateUser(String uname,String passwd);
	
	void closemyConncetion();

}
