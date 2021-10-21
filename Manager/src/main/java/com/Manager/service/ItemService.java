package com.Manager.service;

import java.util.List;

import com.Manager.model.Item;

public interface ItemService {
	List<Item> getAllItem();
	List<Item> getItemsByCategory(String category);
	List<Item> getItemsByName(String name);
}
