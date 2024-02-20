package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.SalesDoc;

public interface SalesDocDao extends JpaRepository<SalesDoc, Long>{

			//Create
	
		SalesDoc createSalesDoc(SalesDoc salesDoc);
			
			//Retrieve
		SalesDoc findSalesDocById(Long salesId);
				
}
