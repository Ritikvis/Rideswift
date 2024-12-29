package com.RideSwift.RideSwift.dto.response;

public class ExceptionResponse {
    private String message;
    private int statusCode;

    // No-Args Constructor
    public ExceptionResponse() {}

    // All-Args Constructor
    public ExceptionResponse(String message, int statusCode) {
        this.message = message;
        this.statusCode = statusCode;
    }

    // Getters
    public String getMessage() {
        return message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    // Setters
    public void setMessage(String message) {
        this.message = message;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}
