package com.poly.controler;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.poly.DAO.AccountDao;
import com.poly.DAO.CategoryDao;
import com.poly.entity.Account;
import com.poly.entity.Category;
import com.poly.service.AccountSer;


@Controller
public class LoginConrtroller {
	
	@Autowired
	AccountSer accountser;
	@Autowired
	HttpSession session;
	@Autowired
	HttpServletRequest req;
	

    
	@GetMapping("/login")
	public String doGetLogin() {
		return "login";
	}
	
	@GetMapping("/logout")
	public String doGetLogout(HttpSession session) {
		session.removeAttribute("user");
//		session.removeAttribute("cart");
		return "redirect:/login";
	}
	
	@PostMapping("/login")
	public String doPostLogin(@RequestParam("username") String username,
			@RequestParam("password") String password,
			HttpSession session) {
		Account user = accountser.checkLogin(username, password);
		if (user != null) {
			session.setAttribute("user", user);
			return "redirect:/index";
		}
		return "redirect:/login";
	}
	
}
