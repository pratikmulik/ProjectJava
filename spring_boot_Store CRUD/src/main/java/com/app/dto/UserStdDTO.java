package com.app.dto;

import javax.validation.constraints.NotBlank;

import com.app.entities.Role;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class UserStdDTO 
{
	//@JsonProperty(access = Access.READ_ONLY)
	private long userId;
	
	
	@NotBlank
	private String firstName;
	
	@NotBlank
	private String lastName;
	
	@NotBlank
	private String homeAddress;
	
	@NotBlank
	private String street;
	
	@NotBlank
	private String area;	

	@NotBlank
	private String city;
	
	@NotBlank
	private String pincode;
	
	private Role userRole;
	
	/*
	@JsonProperty(access = Access.WRITE_ONLY)
	private User user;
	@JsonProperty(access = Access.WRITE_ONLY)
	private SalesDoc salesDoc;
	@JsonProperty(access = Access.WRITE_ONLY)
	private Dispatch dispatch;
	*/
}
