package com.RideSwift.RideSwift.repository;

import com.RideSwift.RideSwift.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepository extends JpaRepository<Coupon,Integer> {
}