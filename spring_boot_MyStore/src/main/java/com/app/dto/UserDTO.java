package com.app.dto;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class UserDTO 

{
	@JsonProperty(access = Access.READ_ONLY)
	private long userId;
	
	@Email 
	@NotBlank
	private String userEmail;
	
	@JsonProperty(access = Access.WRITE_ONLY)
	private String userPassword;
	
	@NotBlank
	private int userPhone;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate ucDate;
	
	/*
	@JsonProperty(access = Access.WRITE_ONLY)
	private UserStd userStd;
	*/

}
