package com.app.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.app.dao.SalesDocDao;
import com.app.dto.SalesDocDTO;
import com.app.entities.SalesDoc;

public class SalesDocServiceImpl implements SalesDocService {

	@Autowired
	private SalesDocDao salesRepo;
	
	@Autowired
	private ModelMapper mapper;
	
	
	@Override
	public SalesDocDTO createSalesDoc(SalesDocDTO dto) {
		SalesDoc sales =mapper.map(dto, SalesDoc.class);
		
		SalesDoc savedSales=salesRepo.save(sales);
		System.out.println("Sales Document saved in database");
		return mapper.map(savedSales, SalesDocDTO.class);
	}

	@Override
	public SalesDocDTO findSalesDocById(Long salesId) {
		SalesDoc sales=salesRepo.findSalesDocById(salesId);
		return mapper.map(sales, SalesDocDTO.class);
	}

}
