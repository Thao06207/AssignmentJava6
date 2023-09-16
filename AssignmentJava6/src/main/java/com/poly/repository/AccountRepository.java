package com.poly.repository;

import org.springframework.data.repository.CrudRepository;

import com.poly.entity.Account;

public interface AccountRepository  extends CrudRepository<Account, String>{
	Account findByUsernameAndPassword(String username, String password);  
	

}
