package com.vitor.sendsms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vitor.sendsms.entities.Sale;
import com.vitor.sendsms.repositories.SaleRepositories;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepositories repository;
	
	public List<Sale> findSales() {
		return repository.findAll();
	}
	
}
