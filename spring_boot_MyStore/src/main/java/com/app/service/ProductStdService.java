package com.app.service;

import com.app.dto.ProductStdDTO;

public interface ProductStdService 
{
	ProductStdDTO createProductStd(ProductStdDTO dto);
	
	ProductStdDTO findProductStdById(Long productId);
	
	ProductStdDTO updateProductStd(Long productId,ProductStdDTO dto);
	
	

	
}
