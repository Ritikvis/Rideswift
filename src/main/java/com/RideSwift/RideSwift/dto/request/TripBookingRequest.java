package com.RideSwift.RideSwift.dto.request;

public class TripBookingRequest {
    private String pickup;
    private String destination;
    private double tripDistanceInKm;
    private String customerEmailId;

    // No-arg constructor
    public TripBookingRequest() {
    }

    // All-args constructor
    public TripBookingRequest(String pickup, String destination, double tripDistanceInKm, String customerEmailId) {
        this.pickup = pickup;
        this.destination = destination;
        this.tripDistanceInKm = tripDistanceInKm;
        this.customerEmailId = customerEmailId;
    }

    // Getters and Setters
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

    public String getCustomerEmailId() {
        return customerEmailId;
    }

    public void setCustomerEmailId(String customerEmailId) {
        this.customerEmailId = customerEmailId;
    }
}
