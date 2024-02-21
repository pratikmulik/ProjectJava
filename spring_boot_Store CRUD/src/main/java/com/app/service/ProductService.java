package com.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.dto.ProductDTO;
@Service
public interface ProductService 
{

ProductDTO createProduct(ProductDTO dto);
	
ProductDTO findProductById(Long productId);
	
ProductDTO updateProduct(Long productId,ProductDTO dto);

List<ProductDTO> findAllProduct(int pageNumber, int pageSize);
	
boolean deleteProductById(Long productId);
	
}
