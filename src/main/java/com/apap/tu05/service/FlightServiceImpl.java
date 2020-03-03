package com.apap.tu05.service;

import java.util.List;

import com.apap.tu05.model.FlightModel;
import com.apap.tu05.repository.FlightDb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * FlightServiceImpl
 */
@Service
@Transactional
public class FlightServiceImpl implements FlightService {
    @Autowired
    private FlightDb flightDb;

    @Override
    public void addFlight(FlightModel flight) {
        flightDb.save(flight);
    }

    @Override
    public void deleteFlight(Long id) {
        flightDb.deleteById(id);
    }

    @Override
    public void updateFlight(long id, FlightModel flight) {
        FlightModel updateFlight = flightDb.findFlightById(id);
        updateFlight.setFlightNumber(flight.getFlightNumber());
        updateFlight.setOrigin(flight.getOrigin());
        updateFlight.setDestination(flight.getDestination());
        updateFlight.setTime(flight.getTime());
        flightDb.save(updateFlight);
    }

    @Override
    public FlightModel getFlight(Long id) {
        return flightDb.findFlightById(id);
    }

    @Override
    public FlightModel getFlightDetailByFlightNumber(String flightNumber) {
        return flightDb.findByFlightNumber(flightNumber);
    }

    @Override
    public List<FlightModel> getAllFlight() {
        return flightDb.findAll();
    }
}