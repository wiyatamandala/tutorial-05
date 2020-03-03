package com.apap.tu05.repository;

import com.apap.tu05.model.FlightModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * FlightDb
 */
@Repository
public interface FlightDb extends JpaRepository<FlightModel, Long>{
    FlightModel findByFlightNumber(String flightNumber);
		FlightModel findFlightById(Long id); 
}