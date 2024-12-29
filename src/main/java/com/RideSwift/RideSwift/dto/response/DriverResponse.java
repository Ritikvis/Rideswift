package com.RideSwift.RideSwift.dto.response;

public class DriverResponse {
    private String name;
    private double rating;
    private String mobNo;
    private CabResponse cabResponse;

    // No-Args Constructor
    public DriverResponse() {}

    // All-Args Constructor
    public DriverResponse(String name, double rating, String mobNo, CabResponse cabResponse) {
        this.name = name;
        this.rating = rating;
        this.mobNo = mobNo;
        this.cabResponse = cabResponse;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public String getMobNo() {
        return mobNo;
    }

    public CabResponse getCabResponse() {
        return cabResponse;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public void setCabResponse(CabResponse cabResponse) {
        this.cabResponse = cabResponse;
    }
}
