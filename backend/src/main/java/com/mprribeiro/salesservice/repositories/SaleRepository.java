package com.mprribeiro.salesservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mprribeiro.salesservice.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
