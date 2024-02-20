package com.app.dto;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class ProductStdDTO 
{
	
@JsonProperty(access = Access.READ_ONLY)
private long productId;

@NotBlank
private double productCost;	
	
	
}
