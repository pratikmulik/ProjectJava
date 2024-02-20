package com.app.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.app.dao.DispatchDao;
import com.app.dto.DispatchDTO;
import com.app.entities.Dispatch;

public class DispatchServiceImpl implements DispatchService {

	@Autowired
	private DispatchDao dispatchRepo;
	
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public DispatchDTO createDispatch(DispatchDTO dto) {
		Dispatch dispatch =mapper.map(dto, Dispatch.class);
		
		Dispatch savedDispatch=dispatchRepo.save(dispatch);
		System.out.println("Dispatch record saved in database");
		return mapper.map(savedDispatch, DispatchDTO.class);
	}

	@Override
	public DispatchDTO findDispatchById(Long dispatchId) 
	{
		Dispatch dispatch=dispatchRepo.findDispatchById(dispatchId);
		return mapper.map(dispatch, DispatchDTO.class);
	}

}
