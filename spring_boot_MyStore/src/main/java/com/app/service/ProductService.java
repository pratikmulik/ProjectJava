package com.app.service;

import java.util.List;

import com.app.dto.ProductDTO;

public interface ProductService 
{

ProductDTO createProduct(ProductDTO dto);
	
ProductDTO findProductById(Long productId);
	
ProductDTO updateProduct(Long productId,ProductDTO dto);

List<ProductDTO> findAllProduct(int pageNumber, int pageSize);
	
boolean deleteProductById(Long productId);
	
}
