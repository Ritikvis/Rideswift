package com.RideSwift.RideSwift.dto.response;

import com.RideSwift.RideSwift.Enum.TripStatus;

import java.util.Date;

public class TripBookingResponse {
    private String bookingId;  // UUID
    private String pickup;
    private String destination;
    private double tripDistanceInKm;
    private double totalFare;
    private TripStatus tripStatus;
    private Date bookedAt;
    private CustomerResponse customerResponse;
    private DriverResponse driverResponse;
    private String message;

    // No-args Constructor
    public TripBookingResponse() {}

    // All-args Constructor
    public TripBookingResponse(String bookingId, String pickup, String destination, double tripDistanceInKm,
                               double totalFare, TripStatus tripStatus, Date bookedAt,
                               CustomerResponse customerResponse, DriverResponse driverResponse, String message) {
        this.bookingId = bookingId;
        this.pickup = pickup;
        this.destination = destination;
        this.tripDistanceInKm = tripDistanceInKm;
        this.totalFare = totalFare;
        this.tripStatus = tripStatus;
        this.bookedAt = bookedAt;
        this.customerResponse = customerResponse;
        this.driverResponse = driverResponse;
        this.message = message;
    }

    // Getters and Setters
    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getPickup() {
        return pickup;
    }

    public void setPickup(String pickup) {
        this.pickup = pickup;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getTripDistanceInKm() {
        return tripDistanceInKm;
    }

    public void setTripDistanceInKm(double tripDistanceInKm) {
        this.tripDistanceInKm = tripDistanceInKm;
    }

    public double getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(double totalFare) {
        this.totalFare = totalFare;
    }

    public TripStatus getTripStatus() {
        return tripStatus;
    }

    public void setTripStatus(TripStatus tripStatus) {
        this.tripStatus = tripStatus;
    }

    public Date getBookedAt() {
        return bookedAt;
    }

    public void setBookedAt(Date bookedAt) {
        this.bookedAt = bookedAt;
    }

    public CustomerResponse getCustomerResponse() {
        return customerResponse;
    }

    public void setCustomerResponse(CustomerResponse customerResponse) {
        this.customerResponse = customerResponse;
    }

    public DriverResponse getDriverResponse() {
        return driverResponse;
    }

    public void setDriverResponse(DriverResponse driverResponse) {
        this.driverResponse = driverResponse;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    // Static Builder Class
    public static class Builder {
        private String bookingId;
        private String pickup;
        private String destination;
        private double tripDistanceInKm;
        private double totalFare;
        private TripStatus tripStatus;
        private Date bookedAt;
        private CustomerResponse customerResponse;
        private DriverResponse driverResponse;
        private String message;

        public Builder bookingId(String bookingId) {
            this.bookingId = bookingId;
            return this;
        }

        public Builder pickup(String pickup) {
            this.pickup = pickup;
            return this;
        }

        public Builder destination(String destination) {
            this.destination = destination;
            return this;
        }

        public Builder tripDistanceInKm(double tripDistanceInKm) {
            this.tripDistanceInKm = tripDistanceInKm;
            return this;
        }

        public Builder totalFare(double totalFare) {
            this.totalFare = totalFare;
            return this;
        }

        public Builder tripStatus(TripStatus tripStatus) {
            this.tripStatus = tripStatus;
            return this;
        }

        public Builder bookedAt(Date bookedAt) {
            this.bookedAt = bookedAt;
            return this;
        }

        public Builder customerResponse(CustomerResponse customerResponse) {
            this.customerResponse = customerResponse;
            return this;
        }

        public Builder driverResponse(DriverResponse driverResponse) {
            this.driverResponse = driverResponse;
            return this;
        }

        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public TripBookingResponse build() {
            return new TripBookingResponse(bookingId, pickup, destination, tripDistanceInKm, totalFare, tripStatus, bookedAt, customerResponse, driverResponse, message);
        }
    }

    // Static method to get Builder instance
    public static Builder builder() {
        return new Builder();
    }
}
