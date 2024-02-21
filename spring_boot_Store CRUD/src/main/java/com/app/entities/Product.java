
package com.app.entities;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name="Product")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Product implements Serializable {
	
	
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ProductId")
	private long productId;
	
	
	@Column(name = "ProductName")
	private String productName;
	
	@Column(name = "ProductDesc")
	private String productDesc;
	
	@Column(name = "ProductStock")
	private int productStock;
	
	@Column(name = "ProductImg")
	private String productImg;

	@OneToOne (fetch = FetchType.LAZY)
	@JoinColumn(name = "ProductStdId")
	private ProductStd productStd;
	
	
}