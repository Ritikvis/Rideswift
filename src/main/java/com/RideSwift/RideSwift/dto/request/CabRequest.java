package com.RideSwift.RideSwift.dto.request;

import com.RideSwift.RideSwift.Enum.CarType;

public class CabRequest {

    private String company;
    private String carModel;
    private String cabNo;
    private CarType carType;
    private int numberOfSeats;
    private double farePerKm;

    // Default constructor
    public CabRequest() {
    }

    // Parameterized constructor
    public CabRequest(String company, String carModel, String cabNo, CarType carType, int numberOfSeats, double farePerKm) {
        this.company = company;
        this.carModel = carModel;
        this.cabNo = cabNo;
        this.carType = carType;
        this.numberOfSeats = numberOfSeats;
        this.farePerKm = farePerKm;
    }

    // Getters and Setters
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCabNo() {
        return cabNo;
    }

    public void setCabNo(String cabNo) {
        this.cabNo = cabNo;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public double getFarePerKm() {
        return farePerKm;
    }

    public void setFarePerKm(double farePerKm) {
        this.farePerKm = farePerKm;
    }
}
