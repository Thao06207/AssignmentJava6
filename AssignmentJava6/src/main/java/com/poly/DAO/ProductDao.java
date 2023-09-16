package com.poly.DAO;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.poly.entity.Product;

public interface ProductDao extends JpaRepository<Product, String> {
   
	@Query("SELECT o FROM Product o WHERE o.name LIKE ?1")
	Page<Product> findByKeywords(String keywords, Pageable pageable);
	Page<Product> findAllByNameLike(String keywords, Pageable pageable);
	
	
	

	
	
}
