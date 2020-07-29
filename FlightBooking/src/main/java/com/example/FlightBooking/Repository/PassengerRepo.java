package com.example.FlightBooking.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.FlightBooking.Modal.Passenger;

@Repository
public interface PassengerRepo extends JpaRepository<Passenger, Long>{
	
	@Query(value= "select * from passenger join bookingrecord on passenger.bookingrecordid= bookingrecord.bookingrecordid", nativeQuery=true)
	List<Passenger> findAllPassengers();

}
