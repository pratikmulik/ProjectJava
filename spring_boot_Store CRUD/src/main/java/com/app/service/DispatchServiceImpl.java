package com.app.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.DispatchDao;
import com.app.dto.DispatchDTO;
import com.app.entities.Dispatch;
@Service
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
		Optional<Dispatch> dispatch=dispatchRepo.findById(dispatchId);
		return mapper.map(dispatch, DispatchDTO.class);
	}

}
