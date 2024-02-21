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

//Dispatch.java
@Entity
@Table(name = "Dispatch")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Dispatch implements Serializable {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "DispatchId")
 private long dispatchId;

 //@Column(name = "UserId")
 //private long userId;

 //@Column(name = "SalesId")
 //private long salesId;

 @DateTimeFormat(pattern = "yyyy-MM-dd")
 @Column(name = "ArrivalDate")
 private LocalDate arrivalDate;

 @OneToOne (fetch = FetchType.LAZY)
 @JoinColumn(name = "UserDispatchId")
 private UserStd userStd;

 @OneToOne (fetch = FetchType.LAZY)
 @JoinColumn(name = "SalesDispatchId")
 private SalesDoc salesDoc;
}


/*
@Entity
@Table(name="Dispatch")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Dispatch extends BaseEntity
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DispatchId")
	private long disptachId;
	
	@Column(name = "UserId")
	private long userId1;
	
	@Column(name = "SalesId")
	private long salesId;
		
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(name = "ArrivalDate")
	private LocalDate arrivalDate;
	//-----------------------------------------------------
	
	//------------------------------------------------
	@OneToOne
	@JoinColumn(name= "UserId")
	private UserStd userStd;
	
	@OneToOne
	@JoinColumn(name= "SalesId")
	private SalesDoc salesDoc;
	
	
}
*/
