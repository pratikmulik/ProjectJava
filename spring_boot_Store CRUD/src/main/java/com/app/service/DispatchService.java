package com.app.service;

import org.springframework.stereotype.Service;

import com.app.dto.DispatchDTO;
@Service
public interface DispatchService {

	DispatchDTO createDispatch(DispatchDTO dto);
	
	DispatchDTO findDispatchById(Long dispatchId);
}
