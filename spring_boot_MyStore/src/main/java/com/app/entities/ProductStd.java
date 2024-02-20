package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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

public class ProductStd extends BaseEntity 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ProductId")
	private long productId;
	
	@Column(name = "ProductCost", nullable = false)
	private double productCost;
	//------------------------------------------------------------
	@OneToOne(mappedBy = "productStd")
   	private Product product;
	//--------------------------------------------------------------
	
	/*NAAAAAAAAAAAAAA
	@ManyToOne(fetch = FetchType.LAZY)
	(mappedBy = "productStd")
   	private Cart cart;
   	*/
}
