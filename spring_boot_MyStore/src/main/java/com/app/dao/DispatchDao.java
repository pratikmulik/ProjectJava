package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Dispatch;

public interface DispatchDao extends JpaRepository<Dispatch, Long>{
	
				//Create
	
			Dispatch createDispatch(Dispatch dispatch);
				
				//Retrieve
			Dispatch findDispatchById(Long dispatchId);

}
