package com.RideSwift.RideSwift.dto.response;

public class CustomerResponse {
    private String name;
    private String emailId;

    // No-Args Constructor
    public CustomerResponse() {}

    // All-Args Constructor
    public CustomerResponse(String name, String emailId) {
        this.name = name;
        this.emailId = emailId;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmailId() {
        return emailId;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
