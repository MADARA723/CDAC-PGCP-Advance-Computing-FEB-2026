package com.demo.service;

import com.demo.dao.DBUtil;
import com.demo.dao.LoginDao;
import com.demo.dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService {
	
	private LoginDao ldao;
	
	public LoginServiceImpl()
	{
		super();
		this.ldao=new LoginDaoImpl();
	}

	@Override
	public String ValidateUser(String uname, String passwd) {
		
		return ldao.authenticationUser(uname, passwd);
	}

	@Override
	public void closemyConncetion() {
		
		ldao.closeMyConnection();
		
	}

}
