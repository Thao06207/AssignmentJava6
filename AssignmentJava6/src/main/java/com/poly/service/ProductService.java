package com.poly.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poly.DAO.ProductDao;
import com.poly.entity.Product;
import com.poly.repository.CategoryRepository;
import com.poly.repository.ProductRepository;

public interface ProductService {
	
	public int add (Product p);
	public int remove(int id);
	public List<Product> getAll();
	
	
	void deleteById(Integer id);

	List<Product> findAll();

	Optional<Product> findById(Integer id);
	
	
}
