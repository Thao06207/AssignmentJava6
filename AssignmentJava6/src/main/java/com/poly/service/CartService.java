package com.poly.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.poly.entity.Item;

@Service
public interface CartService {

	Item add(Integer id);

	void remove(Integer id);

	Item update(Integer id, int qty);

	void clear();

	Collection<Item> getItems();

//	List<Item> getItems();

	int getCount();

	double getAmount();
}
