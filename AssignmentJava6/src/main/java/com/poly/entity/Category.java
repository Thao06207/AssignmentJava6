 package com.poly.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="categories")
public class Category implements Serializable{
	@Id
  @Column(columnDefinition = "nvarchar(50 not null")
	private String categoryId;
	
//	@Column(name = "category_name", length = 100,
//	  columnDefinition  = "nvarchar(100) not null")
	private String name;
	
	@OneToMany(mappedBy ="category") 
         List<Product> products;
    
}
  