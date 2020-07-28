package com.example.FlightBooking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.FlightBooking.Modal.Flight;
import com.example.FlightBooking.Service.FlightService;
import com.example.FlightBooking.Service.FlightServiceImpl;

@RestController
@RequestMapping("flightbooking")
public class Controller {
	@Autowired
	FlightServiceImpl flightService;
	
	@GetMapping
	public @ResponseBody List<Flight> getAllFlights(){
		System.out.println(".............."+ flightService.getAll().get(0));
		return flightService.getAll();
	}

}
