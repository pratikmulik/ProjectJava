package com.app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProductDTO 
{
	@JsonProperty(access = Access.READ_ONLY)
	private Long productId;
	
	@NotNull
	private String productName;
	
	@NotNull
	private String productDesc;
	
	@NotNull
	private int productStock;
	
	@NotNull
	private String productImg;
}
