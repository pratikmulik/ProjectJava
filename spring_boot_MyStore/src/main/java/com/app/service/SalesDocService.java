package com.app.service;

import com.app.dto.SalesDocDTO;

public interface SalesDocService 
{
	SalesDocDTO createSalesDoc(SalesDocDTO dto);
	
	SalesDocDTO findSalesDocById(Long salesId);
	
}
