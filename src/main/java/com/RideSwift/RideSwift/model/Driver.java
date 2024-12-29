package com.RideSwift.RideSwift.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int age;

    private String panNumber;

    @Column(unique = true, nullable = false)
    private String mobNo;

    private double rating;

    @OneToOne(mappedBy = "driver", cascade = CascadeType.ALL)
    @JsonIgnore
    private Cab cab;

    @OneToMany(mappedBy = "driver", cascade = CascadeType.ALL)
    private List<TripBooking> bookings = new ArrayList<>();

    // No-Args Constructor
    public Driver() {}

    // All-Args Constructor
    public Driver(int id, String name, int age, String panNumber, String mobNo, double rating, Cab cab, List<TripBooking> bookings) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.panNumber = panNumber;
        this.mobNo = mobNo;
        this.rating = rating;
        this.cab = cab;
        this.bookings = bookings;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public String getMobNo() {
        return mobNo;
    }

    public double getRating() {
        return rating;
    }

    public Cab getCab() {
        return cab;
    }

    public List<TripBooking> getBookings() {
        return bookings;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setCab(Cab cab) {
        this.cab = cab;
    }

    public void setBookings(List<TripBooking> bookings) {
        this.bookings = bookings;
    }
}
