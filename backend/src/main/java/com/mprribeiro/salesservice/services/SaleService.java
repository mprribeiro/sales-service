package com.mprribeiro.salesservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mprribeiro.salesservice.dto.SaleDTO;
import com.mprribeiro.salesservice.entities.Sale;
import com.mprribeiro.salesservice.repositories.SaleRepository;
import com.mprribeiro.salesservice.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable) {
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(sale -> new SaleDTO(sale));
	}
}
