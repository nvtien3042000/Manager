package com.Manager.dao;

import java.util.Map;

public interface UserDao {
	Map<String, String> login(String userName, String password);
}
