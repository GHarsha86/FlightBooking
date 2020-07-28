package com.example.FlightBooking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.FlightBooking.Modal.Flight;

@Repository
public interface FlightRepo extends JpaRepository<Flight, Long> {

}
