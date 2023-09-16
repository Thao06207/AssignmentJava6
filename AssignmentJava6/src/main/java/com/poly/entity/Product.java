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

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Products")
public class Product implements Serializable {
	@Id
    @Column(columnDefinition = "nvarchar(50 not null")
	private String productId;
	//@Column(columnDefinition = "nvarchar(50 not null")
	private String name;
	@Column(nullable = false)
	private int quantity;
	@Column(nullable = false)
	private double price;
		@Column(length = 200)
	private String image;
		@Column(columnDefinition = "nvarchar(500 not null")
    private String description;
	@Column(nullable = false)
	private double discount;
	@Column(nullable = false)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date enteredDate;
	@Column(nullable = false)
	private String status;
	
	@ManyToOne(cascade = CascadeType.MERGE) 
	@JoinColumn(name = "categoryid",referencedColumnName = "categoryid" )
	private Category category;
	
	@OneToMany(mappedBy ="product") 
    List<OrderDetail> orderdetails;
	
}
