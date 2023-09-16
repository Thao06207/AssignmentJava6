package com.poly.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="Accounts")
public class Account implements Serializable {

	@Id
	
	private String username;
	private String password;
	private String fullname;
	private String email;
	private Boolean admin;
	
//    @OneToMany(mappedBy = "account")
//	List<Order> orders;
    
	
}
