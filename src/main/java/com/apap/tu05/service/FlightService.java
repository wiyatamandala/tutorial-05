package com.apap.tu05.service;

import java.util.List;

import com.apap.tu05.model.FlightModel;

/**
 * FlightService
 */
public interface FlightService {
	void addFlight(FlightModel flight);
	void deleteFlight(Long id); 
	FlightModel getFlight(Long id); 
	void updateFlight(long id, FlightModel flight); 
	FlightModel getFlightDetailByFlightNumber(String flightNumber); 
	List<FlightModel> getAllFlight(); 
}