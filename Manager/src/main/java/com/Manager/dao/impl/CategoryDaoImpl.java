package com.Manager.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Manager.dao.CategoryDao;
import com.Manager.jdbc.DBConnection;
import com.Manager.utils.SqlUtils;

public class CategoryDaoImpl implements CategoryDao{
	private static Connection conn;
	private static Statement st;
	private static PreparedStatement preStatement;
	private static ResultSet rs;

	static {
		conn = DBConnection.getConnection();
	}
	public List<String> getAllCategory() {
		List<String> result = new ArrayList<>();
		String sql = "SELECT NAME FROM category;";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				result.add(rs.getString("name"));
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
