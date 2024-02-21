package com.app.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



//SalesDoc.java
@Entity
@Table(name = "SalesDoc")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class SalesDoc implements Serializable {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "SalesId")
 private long salesId;

 @DateTimeFormat(pattern = "yyyy-MM-dd")
 @Column(name = "SalesDate")
 private LocalDate salesDate;

 //@Column(name = "UserId")
 //private long userId;

 //@Column(name = "CartId")
 //private long cartId;

 @Column(name = "TotalCost")
 private double totalCost;

 @OneToOne(fetch = FetchType.LAZY)
 @JoinColumn(name = "UserCartId")
 private UserStd userStd;
//
 @OneToOne(mappedBy = "salesDoc")
 private Dispatch dispatch; // Include the Dispatch entity in the mapping
}


/*
 * 
@Entity
@Table(name="SalesDoc")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class SalesDoc extends BaseEntity
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SalesId")
	private long salesId;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(name = "SalesDate")
	private LocalDate salesDate;
	
	@Column(name = "UserId")
	private long userId1;
	
	@Column(name = "CartId")
	private long cartId1;
	
	@Column(name = "TotalCost")
	private double totalCost;
	
	//-----------------------------------------------------	
	@OneToOne
	@JoinColumn(name= "UserId")
	private UserStd userStd;
	//-----------------------------------------------------
	@OneToOne
	@JoinColumn(name= "CartId")
	private Cart cart;
	//-------------------------------------------------------
	@OneToOne(mappedBy = "salesDoc")
   	private Dispatch dispatch;
	
		
}

*/