package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.ProductStd;

public interface ProductStdDao extends JpaRepository<ProductStd, Long> 
{

	//Create
	ProductStd createProductStd(ProductStd productStd);
		//Retrieve
	ProductStd findProductStdById(Long productId);
		//Update
	ProductStd updateProductStd(Long productId,ProductStd productStd);
	
	List<ProductStd> findAllProductStd();
	
}
