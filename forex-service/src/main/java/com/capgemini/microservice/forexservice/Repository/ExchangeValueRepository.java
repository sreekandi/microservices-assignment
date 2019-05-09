package com.capgemini.microservice.forexservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.microservice.forexservice.entity.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
	
	ExchangeValue findByFromAndTo(String from,String to);
}
