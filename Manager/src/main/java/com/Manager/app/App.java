package com.Manager.app;

import com.Manager.api.UserApi;
import com.Manager.service.UserService;
import com.Manager.service.impl.UserServiceImpl;

public class App {
	private static UserService userService;
	static {
		userService = new UserServiceImpl();
	}
	public static void main(String[] args) {
//		System.out.println();
		System.out.println(userService.login("tien", "123").size());;
	}
}
