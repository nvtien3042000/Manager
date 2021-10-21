package com.Manager.service.impl;

import java.util.Map;

import com.Manager.dao.UserDao;
import com.Manager.dao.impl.UserDaoImpl;
import com.Manager.service.UserService;

public class UserServiceImpl implements UserService {
	private static UserDao userDao;
	static {
		userDao = new UserDaoImpl();
	}
	@Override
	public Map<String, String> login(String userName, String password) {
		return userDao.login(userName, password);
	}
}
