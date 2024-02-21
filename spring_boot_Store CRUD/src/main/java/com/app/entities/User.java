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


@Entity
@Table(name="User")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString


public class User implements Serializable {
	


	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "UserId")
	private long userId;
	
	@Column(unique=true, name = "UserEmail")
	private String userEmail;
	
	@Column(name = "UserPassword")
	private String userPassword;
	
	@Column(unique=true, name = "UserPhone")
	private String userPhone;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(name="User_Creation_Date")
	private LocalDate ucDate;
	
	
	@OneToOne (fetch = FetchType.LAZY)
	@JoinColumn(name= "UserStdId")
	private UserStd userStd;
	
	

	
}