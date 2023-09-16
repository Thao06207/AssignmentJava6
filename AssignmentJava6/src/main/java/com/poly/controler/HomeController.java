package com.poly.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import com.poly.DAO.CategoryDao;
import com.poly.DAO.ProductDao;
import com.poly.entity.Category;
import com.poly.entity.Product;




@Controller

public class HomeController {
	

	@RequestMapping("/")
	public String index() {
		return "home";
	}
	
	 @Autowired
		ProductDao dao; // làm việc với bảng Product
	 @Autowired
		CategoryDao dao1;	
		@RequestMapping("/index")
		public String index(Model model) {
		Product item = new Product();
		Category cate = new Category();
		model.addAttribute("cate", cate);
		model.addAttribute("item", item);
		List<Product> items = dao.findAll();
		model.addAttribute("items", items);
		List<Category> listcate = dao1.findAll();
		model.addAttribute("listcate", listcate);
		return "home";
		}
		
//		@GetMapping("/shop")
//		public String shop(Model model) {
//			model.addAttribute("listcate", dao1.findAll());
//			model.addAttribute("items",dao.findAll());
//			return "home";
//			
//		}
//        
//		@GetMapping("/shop/category/{id}")
//		public String shop1(@PathVariable int id,Model model) {
//			model.addAttribute("listcate", dao1.findAll());
//			model.addAttribute("items",dao.findAll());
//			return "home";
//			
//		}
		
	
	 @RequestMapping("/about")
	 public String index2() { 
		 return "about"; 
		 }
	 
	  @RequestMapping("/Product")
	  public String index3(Model model) {
		  Product item = new Product();
			Category cate = new Category();
			model.addAttribute("cate", cate);
			model.addAttribute("item", item);
			List<Product> items = dao.findAll();
			model.addAttribute("items", items);
			List<Category> listcate = dao1.findAll();
			model.addAttribute("listcate", listcate);
		  return "Product"; 
		  }
	    
	  
	  @RequestMapping("/contact")
	  public String index5() {
		  return "contact";
		  }
	 
	  
	  @RequestMapping("/special")
	  public String index6(Model model) {
		  Product item = new Product();
			Category cate = new Category();
			model.addAttribute("cate", cate);
			model.addAttribute("item", item);
			List<Product> items = dao.findAll();
			model.addAttribute("items", items);
			List<Category> listcate = dao1.findAll();
			model.addAttribute("listcate", listcate);
		  return "specials"; 
		  }
	 
	  
	  @RequestMapping("/cart")
	  public String index7() {
		  return "cart";
		  }
}
