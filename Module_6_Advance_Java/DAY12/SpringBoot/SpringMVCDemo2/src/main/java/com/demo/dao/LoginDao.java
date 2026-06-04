package com.demo.dao;

import com.demo.beans.MyUser;

public interface LoginDao {

	MyUser authenticteUser(String u1, String pass);

}
