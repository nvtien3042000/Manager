package com.Manager.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import com.Manager.dao.UserDao;
import com.Manager.jdbc.DBConnection;
import com.Manager.utils.SqlUtils;


public class UserDaoImpl implements UserDao{
	
	private static Connection conn;
	private static Statement st;
	private static PreparedStatement preStatement;
	private static ResultSet rs;

	static {
		conn = DBConnection.getConnection();
	}
	
	@Override
	public Map<String, String> login(String userName, String password) {
		Map<String, String> result = new HashMap<>();
		String sql = "SELECT id, userName, role FROM account\r\n"
				+ "WHERE userName = '" + userName + "' AND password = '" + password + "'";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				result.put("id", rs.getString("id"));
				result.put("userName", rs.getString("userName"));
				result.put("role", rs.getString("role"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			SqlUtils.close(rs, preStatement);
		}
		
		return result;
	}
}
