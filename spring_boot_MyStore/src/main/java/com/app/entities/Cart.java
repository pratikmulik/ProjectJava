package com.app.entities;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Cart")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Cart extends BaseEntity

{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CartId")
	private long cartId;
	//---------------------------------------------
	
	@OneToMany
	@JoinColumn(name = "CartId")
	private List<ProductStd> productList = new ArrayList<>();
	
	//-------------------------------------------------
	
	@OneToOne(mappedBy = "cart")
   	private SalesDoc salesDoc;
}
