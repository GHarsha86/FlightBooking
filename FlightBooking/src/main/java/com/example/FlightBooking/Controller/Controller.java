package com.example.FlightBooking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.FlightBooking.Modal.Flight;
import com.example.FlightBooking.Service.FlightService;
import com.example.FlightBooking.Service.FlightServiceImpl;

@RestController
@RequestMapping("/flightbooking")
public class Controller {
	@Autowired
	FlightService flightService;
	
	@GetMapping("/getflights")
	public @ResponseBody List<Flight> getAllFlights(){
		//System.out.println(".............."+ flightService.getAll().get(0));
		return flightService.getAll();
	}
	
	@GetMapping("/getflights/{flightType}/{origin}/{date}")
	public @ResponseBody List<Flight> getFlightsfrom(@PathVariable String origin, @PathVariable String date, @PathVariable String flightType) {
		return flightService.getFlightType(flightType, origin, date);
		
	}
	
	@GetMapping("/getflight/{origin}/{destination}/{date}")
	public @ResponseBody List<Flight> getFlightsTofrom(@PathVariable String origin, @PathVariable String date, @PathVariable String destination) {
		return flightService.getFlightToFrom(origin,destination, date);
		
	}

}
