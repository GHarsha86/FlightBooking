package com.example.FlightBooking.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.FlightBooking.Modal.Flight;

@Repository
public interface FlightRepo extends JpaRepository<Flight, Long> {

	@Query(value ="select * from flight where flight.origin= origin and flight.flightdate= flightdate", nativeQuery=true)
	List<Flight> findOriginFlight(@Param("origin") String origin, @Param("date") String flightdate);
	
	@Query(value= "select * from flight join flightinfo  on flight.flightnumber= flightinfo.flightnumber and flight.origin= origin and flight.flightdate=flightdate and flightinfo.flighttype=flighttype", nativeQuery=true)
	List<Flight> findFlightType(@Param("origin") String origin, @Param("date") String flightdate, @Param("flightType") String flighttype);
	
	@Query(value="select * from flight join fare on flight.origin=origin and flight.destination=destination and flight.flightdate= flightdate and flight.fareid=fare.fareid order by fare.fare;", nativeQuery= true)
	List<Flight> findFlightToFrom(@Param("origin") String origin, @Param("date") String flightdate, @Param("destination") String destination);
	
	@Query(value="select * from flight where flight.origin= origin and flight.destination=destination and flight.flightnumber=flightnumber", nativeQuery=true)
	List<Flight> findFlightCombo(@Param("origin") String origin, @Param("destination") String destination, @Param("flightnumber") String flightnumber);
	
	@Query(value="select * from flight where flight.flightnumber=flightnumber and flight.flightdate=flightdate and flight.flighttime=flighttime", nativeQuery=true)
	List<Flight> findFlightTime(@Param("flightnumber") String flightnumber, @Param("flightdate") String flightdate, @Param("flighttime") String flighttime);
}

