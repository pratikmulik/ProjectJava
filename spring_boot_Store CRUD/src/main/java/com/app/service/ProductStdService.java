package com.app.service;

import org.springframework.stereotype.Service;

import com.app.dto.ProductStdDTO;
@Service
public interface ProductStdService 
{
	ProductStdDTO createProductStd(ProductStdDTO dto);
	
	ProductStdDTO findProductStdById(Long productId);
	
	ProductStdDTO updateProductStd(Long productId,ProductStdDTO dto);
	
	

	
}
