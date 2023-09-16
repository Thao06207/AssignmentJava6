package com.poly.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Orders")
public class Order implements Serializable {
	@Id
	
	private int orderId;
	@Temporal(TemporalType.DATE)
	private Date orderDate;
//	@Column(nullable = false)
	private double amount;
//	@Column(nullable = false)
	private String status;
	
	@ManyToOne @JoinColumn(name="customerid")
	 Customer customer;
	
	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
	 List<OrderDetail> orderDetails;
	
	
}
