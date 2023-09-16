package com.poly.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poly.entity.Account;
import com.poly.repository.AccountRepository;

@Service
public class AccountSer {
    
	@Autowired
	private AccountRepository pro;
	
	public Account checkLogin(String username, String password) {
		return pro.findByUsernameAndPassword(username, password);
	}
}
