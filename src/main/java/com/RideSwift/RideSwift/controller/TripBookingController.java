package com.RideSwift.RideSwift.controller;

import com.RideSwift.RideSwift.dto.request.TripBookingRequest;
import com.RideSwift.RideSwift.dto.response.TripBookingResponse;
import com.RideSwift.RideSwift.service.TripBookingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/trip")
public class TripBookingController {

    private final TripBookingService tripBookingService;

    // Manually defined constructor for dependency injection
    public TripBookingController(TripBookingService tripBookingService) {
        this.tripBookingService = tripBookingService;
    }

    @PostMapping("/book")
    public ResponseEntity<TripBookingResponse> bookCab(@RequestParam(value = "apply-coupon", required = false, defaultValue = "false") boolean applyCoupon,
                                                       @RequestBody TripBookingRequest tripBookingRequest) {
        TripBookingResponse response = tripBookingService.bookCab(applyCoupon, tripBookingRequest);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
