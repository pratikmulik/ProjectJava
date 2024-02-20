package com.app.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "UserStd")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class UserStd extends BaseEntity 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="UserId")
	private long userId;
	
	
	@Column(nullable = false, length = 20, name = "FirstName")
	private String firstName;
	
	@Column (nullable = false, length=20, name = "LastName")
	private String lastName;
	
	@Column (nullable = false,length=50, name = "HomeAddress")
	private String homeAddress;
	
	@Column (nullable = false,length=50,  name = "Street")
	private String street;
	
	@Column (nullable = false, length=50, name = "Area")
	private String area;	

	@Column (nullable = false, length=30, name = "City")
	private String city;
	
	@Column (nullable = false, length=10, name = "Pincode")
	private int pincode;

	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false, name = "UserRole")
	private Role userRole;
	
	//------------------------------------
	@OneToOne (mappedBy = "userStd") //from the user table
	private User user;
	//----------------------------------------------
	@OneToOne (mappedBy = "userStd") 
	private SalesDoc salesDoc;
	//----------------------------------------------
	
	@OneToOne (mappedBy = "userStd") 
	private Dispatch dispatch;
}



