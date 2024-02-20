package com.app.entities;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
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


@Entity
@Table(name="User")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class User extends BaseEntity {
	
	
	@Id
	@Column(name = "UserId")
	private long userId;
	
	@Column(unique=true, name = "UserEmail")
	private String userEmail;
	
	@Column(name = "UserPassword")
	private String userPassword;
	
	@Column(unique=true, name = "UserPhone")
	private int userPhone;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(name="User_Creation_Date")
	private LocalDate ucDate;
	
	
	@OneToOne
	@JoinColumn(name= "UserId")
	private UserStd userStd;
	
	

	
}