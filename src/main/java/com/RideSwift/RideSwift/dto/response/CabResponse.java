package com.RideSwift.RideSwift.dto.response;

public class CabResponse {
    private String cabNo;
    private String carModel;
    private double farePerKm;

    // No-Args Constructor
    public CabResponse() {}

    // All-Args Constructor
    public CabResponse(String cabNo, String carModel, double farePerKm) {
        this.cabNo = cabNo;
        this.carModel = carModel;
        this.farePerKm = farePerKm;
    }

    // Getters
    public String getCabNo() {
        return cabNo;
    }

    public String getCarModel() {
        return carModel;
    }

    public double getFarePerKm() {
        return farePerKm;
    }

    // Setters
    public void setCabNo(String cabNo) {
        this.cabNo = cabNo;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setFarePerKm(double farePerKm) {
        this.farePerKm = farePerKm;
    }
}
