package com.Manager.service.impl;

import java.util.List;

import com.Manager.dao.ItemDao;
import com.Manager.dao.impl.ItemDaoImpl;
import com.Manager.model.Item;
import com.Manager.service.ItemService;

public class ItemServiceImpl implements ItemService{
	private static ItemDao itemDao;
	static {
		itemDao = new ItemDaoImpl();
	}
	@Override
	public List<Item> getAllItem() {
		return itemDao.getAllItem();
	}
	@Override
	public List<Item> getItemsByCategory(String category) {
		return itemDao.getItemsByCategory(category);
	}
	@Override
	public List<Item> getItemsByName(String name) {
		return itemDao.getItemsByName(name);
	}
}
