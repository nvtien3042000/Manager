package com.Manager.dao;

import java.util.List;

import com.Manager.model.Item;

public interface ItemDao {
	List<Item> getAllItem();
	List<Item> getItemsByCategory(String category);
	List<Item> getItemsByName(String name);
}
