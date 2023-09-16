package com.poly.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.poly.DAO.AccountDao;
import com.poly.DAO.CategoryDao;
import com.poly.DAO.ProductDao;
import com.poly.entity.Account;
import com.poly.entity.Category;
import com.poly.entity.Product;
import com.poly.repository.CategoryRepository;
import com.poly.service.ParamService;

@Controller
public class AdminController {
	
	@RequestMapping("/admin")
	public String admin() {
		return "admin";
	}
	
	@Autowired
	CategoryDao dao;
	@Autowired
	ParamService paramService;
	@Autowired
	ProductDao dao1;
	
	@Autowired
	AccountDao dao2;
	
	
	@RequestMapping("/admin/category")
	public String index(Model model) {
		Category category = new Category();
		model.addAttribute("category", category);
		List<Category> categories = dao.findAll();
		model.addAttribute("categories", categories);
		return "/admin/category";
	}
	
	@RequestMapping("/category/edit/{categoryId}")
	public String edit(@PathVariable("categoryId") String categoryId, Model model) {
		Category category = dao.findById(categoryId).get();
		model.addAttribute("category", category);
		List<Category> categories = dao.findAll();
		model.addAttribute("categories", categories);
		return "/admin/category";
}
	@PostMapping("/category/create")
	public String create(Category category) {
		dao.save(category);
		return "redirect:/admin/category";
	}
	@PostMapping("/category/update")
	public String update(Category category) {
		dao.save(category);
		return "redirect:/category/edit/"+category.getCategoryId();
}
	@GetMapping("/category/delete/{categoryId}")
	public String delete(@PathVariable("categoryId") String categoryId) {
		dao.deleteById(categoryId);
		return "redirect:/admin/category";
	}
   
	@RequestMapping("/admin/product")
	public String index1(Model model) {
		Product product = new Product();
		model.addAttribute("product", product);
		List<Product> products = dao1.findAll();
		model.addAttribute("products", products);
		return "/admin/product";
	}
	
	@RequestMapping("/product/edit/{productId}")
	public String edit1(@PathVariable("productId") String  productId, Model model) {
		Product product = dao1.findById(productId).get();
		model.addAttribute("product", product);
		List<Product> products = dao1.findAll();
		model.addAttribute("products", products);
		return "/admin/product";
}
	@PostMapping("/product/create")	
	public String create1(Product product) {
		dao1.save(product);
		return "redirect:/admin/product";
	}
	
	

	@PostMapping("/product/update")
	public String update1(Product product) {
		dao1.save(product);
		return "redirect:/product/edit/"+product.getProductId();
}
	@GetMapping("/product/delete/{productId}")
	public String delete1(@PathVariable("productId") String productId) {
		dao1.deleteById(productId);
		return "redirect:/admin/product";
	}
  
	@RequestMapping("/admin/account")
	public String index2(Model model) {
		Account account = new Account();
		model.addAttribute("account", account);
		List<Account> accounts = dao2.findAll();
		model.addAttribute("accounts", accounts);
		return "/admin/account";
	}
	
	@RequestMapping("/account/edit/{username}")
	public String edit2(@PathVariable("username") String username, Model model) {
		Account account = dao2.findById(username).get();
		model.addAttribute("account", account);
		List<Account> accounts = dao2.findAll();
		model.addAttribute("accounts", accounts);
		return "/admin/account";
}
	@RequestMapping("/register")
	public String create2(Account account) {
		dao2.save(account);
		return "/login";
	}
	@PostMapping("/account/update")
	public String update2(Account account) {
		dao2.save(account);
		return "redirect:/account/edit/"+account.getUsername();
}
	@GetMapping("/account/delete/{username}")
	public String delete2(@PathVariable("username") String username) {
		dao.deleteById(username);
		return "redirect:/admin/account";
	}
   

}
