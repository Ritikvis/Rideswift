package com.RideSwift.RideSwift.dto.request;

public class DriverRequest {
    private String name;
    private int age;
    private String panNumber;
    private String mobNo;
    private CabRequest cab;

    // No-Args Constructor
    public DriverRequest() {}

    // All-Args Constructor
    public DriverRequest(String name, int age, String panNumber, String mobNo, CabRequest cab) {
        this.name = name;
        this.age = age;
        this.panNumber = panNumber;
        this.mobNo = mobNo;
        this.cab = cab;
    }

    // Getters
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

    public CabRequest getCab() {
        return cab;
    }

    // Setters
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

    public void setCab(CabRequest cab) {
        this.cab = cab;
    }
}
