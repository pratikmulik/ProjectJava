package com.app.service;

import com.app.dto.DispatchDTO;

public interface DispatchService {

	DispatchDTO createDispatch(DispatchDTO dto);
	
	DispatchDTO findDispatchById(Long dispatchId);
}
