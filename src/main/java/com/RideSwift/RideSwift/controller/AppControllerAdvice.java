package com.RideSwift.RideSwift.controller;

import com.RideSwift.RideSwift.dto.response.TripBookingResponse;
import com.RideSwift.RideSwift.exception.CabNotAvailableException;
import com.RideSwift.RideSwift.exception.CustomerNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class AppControllerAdvice {
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler({CustomerNotFoundException.class,
            CabNotAvailableException.class})
    public ResponseEntity<TripBookingResponse> handleException(Exception ex){
        // Manually create the TripBookingResponse object
        TripBookingResponse response = new TripBookingResponse();
        response.setMessage(ex.getMessage());

        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
