package com.RideSwift.RideSwift.model;

import com.RideSwift.RideSwift.Enum.Gender;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int age;

    @Column(unique = true, nullable = false)
    private String emailId;

    private String address;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<TripBooking> bookings = new ArrayList<>();

    // No-Args Constructor
    public Customer() {}

    // All-Args Constructor
    public Customer(int id, String name, int age, String emailId, String address, Gender gender, List<TripBooking> bookings) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.emailId = emailId;
        this.address = address;
        this.gender = gender;
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

    public String getEmailId() {
        return emailId;
    }

    public String getAddress() {
        return address;
    }

    public Gender getGender() {
        return gender;
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

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setBookings(List<TripBooking> bookings) {
        this.bookings = bookings;
    }
}
