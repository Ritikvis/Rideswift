package com.RideSwift.RideSwift.dto.request;

import com.RideSwift.RideSwift.Enum.Gender;

public class CustomerRequest {

    private String name;
    private int age;
    private String emailId;
    private String address;
    private Gender gender;

    // Default constructor
    public CustomerRequest() {
    }

    // Parameterized constructor
    public CustomerRequest(String name, int age, String emailId, String address, Gender gender) {
        this.name = name;
        this.age = age;
        this.emailId = emailId;
        this.address = address;
        this.gender = gender;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
