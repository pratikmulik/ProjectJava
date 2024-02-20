package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.app.entities.Product;

public interface ProductDao extends JpaRepository<Product, Long>{
	
	//Create
Product createProduct(Product product);
	//Retrieve
Product findProductById(Long productId);
	//Update
Product updateProduct(Long productId,Product product);

List<Product> findAllProduct();


//Delete

@Query("delete from Product p where p.ProductId=:productId")
@Modifying
boolean deleteProductById(Long productId);


}
