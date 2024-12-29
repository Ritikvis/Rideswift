package com.RideSwift.RideSwift.model;

import com.RideSwift.RideSwift.Enum.CarType;
import jakarta.persistence.*;

@Entity
public class Cab {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true, nullable = false)
    private String cabNo;

    private String carModel;

    private boolean available;

    @Enumerated(EnumType.STRING)
    private CarType carType;

    private int numberOfSeats;

    private double farePerKm;

    @OneToOne
    @JoinColumn(name = "driver_id")
    private Driver driver;

    // No-Args Constructor
    public Cab() {}

    // All-Args Constructor
    public Cab(int id, String cabNo, String carModel, boolean available, CarType carType, int numberOfSeats, double farePerKm, Driver driver) {
        this.id = id;
        this.cabNo = cabNo;
        this.carModel = carModel;
        this.available = available;
        this.carType = carType;
        this.numberOfSeats = numberOfSeats;
        this.farePerKm = farePerKm;
        this.driver = driver;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getCabNo() {
        return cabNo;
    }

    public String getCarModel() {
        return carModel;
    }

    public boolean isAvailable() {
        return available;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getFarePerKm() {
        return farePerKm;
    }

    public Driver getDriver() {
        return driver;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setCabNo(String cabNo) {
        this.cabNo = cabNo;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setFarePerKm(double farePerKm) {
        this.farePerKm = farePerKm;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
