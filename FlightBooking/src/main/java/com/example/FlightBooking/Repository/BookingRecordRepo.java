package com.example.FlightBooking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FlightBooking.Modal.BookingRecord;

public interface BookingRecordRepo extends JpaRepository<BookingRecord, Long> {

}
