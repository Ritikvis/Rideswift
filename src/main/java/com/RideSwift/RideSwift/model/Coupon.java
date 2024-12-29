package com.RideSwift.RideSwift.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String couponCode;

    private int percentageDiscount;

    // No-Args Constructor
    public Coupon() {}

    // All-Args Constructor
    public Coupon(int id, String couponCode, int percentageDiscount) {
        this.id = id;
        this.couponCode = couponCode;
        this.percentageDiscount = percentageDiscount;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public int getPercentageDiscount() {
        return percentageDiscount;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public void setPercentageDiscount(int percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }
}
