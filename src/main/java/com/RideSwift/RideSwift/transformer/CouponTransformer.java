package com.RideSwift.RideSwift.transformer;

import com.RideSwift.RideSwift.model.Coupon;

public class CouponTransformer {
    public static Coupon prepareCoupon(String couponCode, int discount) {
        // Manually creating a Coupon object without using builder
        Coupon coupon = new Coupon();
        coupon.setCouponCode(couponCode);
        coupon.setPercentageDiscount(discount);
        return coupon;
    }
}
