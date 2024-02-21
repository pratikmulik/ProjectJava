package com.app.service;

import org.springframework.stereotype.Service;

import com.app.dto.SalesDocDTO;
@Service
public interface SalesDocService 
{
	SalesDocDTO createSalesDoc(SalesDocDTO dto);
	
	SalesDocDTO findSalesDocById(Long salesId);
	
}
