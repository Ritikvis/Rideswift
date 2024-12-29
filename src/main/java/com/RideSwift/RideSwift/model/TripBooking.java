package com.RideSwift.RideSwift.model;

import com.RideSwift.RideSwift.Enum.TripStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
public class TripBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String bookingId;  // UUID

    private String pickup;

    private String destination;

    private double tripDistanceInKm;

    private double totalFare;

    @Enumerated(EnumType.STRING)
    private TripStatus tripStatus;

    @CreationTimestamp
    private Date bookedAt;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    private Customer customer;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    private Driver driver;

    // No-Args Constructor
    public TripBooking() {}

    // All-Args Constructor
    public TripBooking(int id, String bookingId, String pickup, String destination, double tripDistanceInKm, double totalFare, TripStatus tripStatus, Date bookedAt, Customer customer, Driver driver) {
        this.id = id;
        this.bookingId = bookingId;
        this.pickup = pickup;
        this.destination = destination;
        this.tripDistanceInKm = tripDistanceInKm;
        this.totalFare = totalFare;
        this.tripStatus = tripStatus;
        this.bookedAt = bookedAt;
        this.customer = customer;
        this.driver = driver;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getPickup() {
        return pickup;
    }

    public String getDestination() {
        return destination;
    }

    public double getTripDistanceInKm() {
        return tripDistanceInKm;
    }

    public double getTotalFare() {
        return totalFare;
    }

    public TripStatus getTripStatus() {
        return tripStatus;
    }

    public Date getBookedAt() {
        return bookedAt;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Driver getDriver() {
        return driver;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public void setPickup(String pickup) {
        this.pickup = pickup;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setTripDistanceInKm(double tripDistanceInKm) {
        this.tripDistanceInKm = tripDistanceInKm;
    }

    public void setTotalFare(double totalFare) {
        this.totalFare = totalFare;
    }

    public void setTripStatus(TripStatus tripStatus) {
        this.tripStatus = tripStatus;
    }

    public void setBookedAt(Date bookedAt) {
        this.bookedAt = bookedAt;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
