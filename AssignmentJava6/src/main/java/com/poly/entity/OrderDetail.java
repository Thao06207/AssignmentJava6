package com.poly.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Orderdetails")
public class OrderDetail implements Serializable {
	@Id
	private int orderDetailId;
//	@Column(nullable = false)
	private int quantity;
//	@Column(nullable = false)
	private double price;
	
	@ManyToOne @JoinColumn(name="productid")
	 Product product;
	
	@ManyToOne @JoinColumn(name="orderid")
     Order order;

}
