package com.RideSwift.RideSwift.service;

import com.RideSwift.RideSwift.model.Coupon;
import com.RideSwift.RideSwift.repository.CouponRepository;
import com.RideSwift.RideSwift.transformer.CouponTransformer;
import org.springframework.stereotype.Service;

@Service
public class CouponService {
    private final CouponRepository couponRepository;

    public CouponService(CouponRepository couponRepository) {
        this.couponRepository = couponRepository;
    }

    public String addCoupon(String couponCode, int discount) {
        Coupon coupon = CouponTransformer.prepareCoupon(couponCode,discount);
        couponRepository.save(coupon);
        return "Coupon added successfully!!";
    }
}
