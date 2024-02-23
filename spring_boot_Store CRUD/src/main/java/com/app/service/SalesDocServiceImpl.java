package com.app.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.custom_exceptions.ResourceNotFoundException;
import com.app.dao.SalesDocDao;
import com.app.dto.SalesDocDTO;
import com.app.entities.SalesDoc;
@Service
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
		//Optional<SalesDoc> sales=salesRepo.findById(salesId);
		//return mapper.map(sales, SalesDocDTO.class);
		return mapper.map(salesRepo.findById(salesId).orElseThrow(()-> new ResourceNotFoundException("Invalid Product ID or Product not yet saved"))
				, SalesDocDTO.class);
	}

}
