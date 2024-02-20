package com.app.dto;

import java.util.ArrayList;
import java.util.List;

import com.app.entities.ProductStd;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CartDTO 
{
	@JsonProperty(access = Access.READ_ONLY)
	private long cartId;
	
	 
    private List<ProductStd> productList = new ArrayList<>();
	
}
