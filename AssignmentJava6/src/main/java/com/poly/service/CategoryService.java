package com.poly.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poly.DAO.CategoryDao;
import com.poly.entity.Category;
import com.poly.entity.Product;
import com.poly.repository.CategoryRepository;


@Service
public class CategoryService {
      
	@Autowired
	private CategoryDao dao;
	
	public List<Category> findAll() {
		return dao.findAll();
	}
	
	
		
	
}

