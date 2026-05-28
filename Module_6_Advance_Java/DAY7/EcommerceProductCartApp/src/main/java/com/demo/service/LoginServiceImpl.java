package com.demo.service;

import java.sql.Connection;

import com.demo.dao.LoginDao;
import com.demo.dao.LoginDaoImpl;
import com.demo.model.MyUser;

public class LoginServiceImpl implements LoginService{
	private LoginDao ldao;
	
	public LoginServiceImpl() {
		
		this.ldao = new LoginDaoImpl();;
	}

	@Override
	public MyUser validateUser(String uname, String paswd) {
		// TODO Auto-generated method stub
		return ldao.authenticateUser(uname,paswd);
	}

}
