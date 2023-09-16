package com.poly.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.poly.DAO.CategoryDao;
import com.poly.DAO.ProductDao;
import com.poly.entity.Category;
import com.poly.entity.Product;
import com.poly.service.CartService;
import com.poly.service.SessionService;

@Controller
public class ProductController {
	@Autowired
	ProductDao dao;
	@Autowired
	CategoryDao dao1;
	@Autowired
	SessionService session;
	@Autowired(required = false)
	CartService cartSer;
	
	@GetMapping("/search-and-page")
	public String searchAndPage(Model model, @RequestParam("keywords") Optional<String> kw,
			@RequestParam("p") Optional<Integer> p) {
		String kwords = kw.orElse(session.get("keywords", ""));
		session.set("keywords", kwords);
		Pageable pageable = PageRequest.of(p.orElse(0), 5);
		Page<Product> page = dao.findByKeywords("%" + kwords + "%", pageable);
		model.addAttribute("page", page);
		return "home";
	}

	

//// localhost:8080/?id=...
//	@RequestMapping("/item/{id}")
//	public String doGetSPByMaSP(@RequestParam("id") String productId, Model model) {
//		Product item = pService.findByProductId(productId);
//		model.addAttribute("item", item);
//		List<Category> cate = dmService.findAll();
//		model.addAttribute("cate", cate);
//		return "item";
//	}
	


	/*
	 * @RequestMapping("/datail") public String item() { return "datail"; }
	 */
	/*
	 * @RequestMapping("/datail/{productId}") public String
	 * items(@PathVariable("productId") String productId , Model model) { Product
	 * items = dao.findById(productId).get(); model.addAttribute("items", items);
	 * List<Product> item = dao.findAll(); model.addAttribute("item", item); //
	 * model.addAttribute("countcart", cartSer.getCount()); return "datail"; }
	 */
	
	@RequestMapping("datail/{orderDetailId}")
	public String details(@PathVariable("orderDetailId")String id, Model model) {
		Product item = dao.findById(id).get();
		model.addAttribute("item", item);
		return "datail";
	}
	
	

}
