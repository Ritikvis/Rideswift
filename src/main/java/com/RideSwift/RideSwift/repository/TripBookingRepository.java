package com.RideSwift.RideSwift.repository;

import com.RideSwift.RideSwift.model.TripBooking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripBookingRepository extends JpaRepository<TripBooking, Integer> {
}