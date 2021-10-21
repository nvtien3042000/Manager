package com.Manager.service.impl;

import java.util.List;

import com.Manager.dao.CategoryDao;
import com.Manager.dao.impl.CategoryDaoImpl;
import com.Manager.service.CategoryService;

public class CategoryServiceImpl implements CategoryService{
	private static CategoryDao categoryDao;
	static {
		categoryDao = new CategoryDaoImpl();
	}
	@Override
	public List<String> getAllCategory() {
		return categoryDao.getAllCategory();
	}
}
