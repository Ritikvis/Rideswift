package com.RideSwift.RideSwift.transformer;

import com.RideSwift.RideSwift.Enum.TripStatus;
import com.RideSwift.RideSwift.dto.request.TripBookingRequest;
import com.RideSwift.RideSwift.dto.response.TripBookingResponse;
import com.RideSwift.RideSwift.model.TripBooking;

import java.util.UUID;

public class BookingTransformer {

    // Method to transform TripBookingRequest to TripBooking
    public static TripBooking bookingRequestToBooking(TripBookingRequest tripBookingRequest) {
        TripBooking tripBooking = new TripBooking();
        tripBooking.setBookingId(String.valueOf(UUID.randomUUID()));
        tripBooking.setPickup(tripBookingRequest.getPickup());
        tripBooking.setDestination(tripBookingRequest.getDestination());
        tripBooking.setTripDistanceInKm(tripBookingRequest.getTripDistanceInKm());
        tripBooking.setTripStatus(TripStatus.IN_TRANSIT);
        // Set other properties as needed
        return tripBooking;
    }

    // Method to transform TripBooking to TripBookingResponse
    public static TripBookingResponse tripBookingToTripBookingResponse(TripBooking tripBooking) {
        TripBookingResponse tripBookingResponse = new TripBookingResponse();
        tripBookingResponse.setBookingId(tripBooking.getBookingId());
        tripBookingResponse.setPickup(tripBooking.getPickup());
        tripBookingResponse.setDestination(tripBooking.getDestination());
        tripBookingResponse.setTripDistanceInKm(tripBooking.getTripDistanceInKm());
        tripBookingResponse.setTotalFare(tripBooking.getTotalFare());
        tripBookingResponse.setTripStatus(tripBooking.getTripStatus());
        tripBookingResponse.setBookedAt(tripBooking.getBookedAt());
        tripBookingResponse.setCustomerResponse(CustomerTransformer.customerToCustomerResponse(tripBooking.getCustomer()));
        tripBookingResponse.setDriverResponse(DriverTransformer.driverToDriverResponse(tripBooking.getDriver()));
        // Set other properties as needed
        return tripBookingResponse;
    }
}
