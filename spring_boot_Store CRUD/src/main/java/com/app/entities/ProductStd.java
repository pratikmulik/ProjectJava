package com.app.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table (name="ProductStd")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class ProductStd implements Serializable
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ProductStdId")
	private long productStdId;
	
	@Column(name = "ProductCost", nullable = false)
	private double productCost;
	//------------------------------------------------------------
	@OneToOne(mappedBy = "productStd")
   	private Product product;
	//--------------------------------------------------------------
	
	
	@ManyToOne
   	private Cart cart;
   	
}
