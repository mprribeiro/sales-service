package com.mprribeiro.salesservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mprribeiro.salesservice.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
