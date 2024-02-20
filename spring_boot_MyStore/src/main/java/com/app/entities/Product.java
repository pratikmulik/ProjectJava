
package com.app.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
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

public class Product extends BaseEntity {
	
	
	@Id
	@Column(name = "ProductId")
	private int productId;
	
	
	@Column(name = "ProductName")
	private String productName;
	
	@Column(name = "ProductDesc")
	private String productDesc;
	
	@Column(name = "ProductStock")
	private int productStock;
	
	@Column(name = "ProductImg")
	private String productImg;

	@OneToOne
	@JoinColumn(name = "ProductId")
	private ProductStd productStd;
	
	
}