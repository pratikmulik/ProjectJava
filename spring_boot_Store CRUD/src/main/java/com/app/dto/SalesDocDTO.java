package com.app.dto;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SalesDocDTO 
{
	@JsonProperty(access = Access.READ_ONLY)
	private long salesId;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate salesDate;
	
	//@NotNull
	//private long userId;
	
	//@NotNull
	//private long cartId;
	
	@NotNull
	private double totalCost;
	
}
