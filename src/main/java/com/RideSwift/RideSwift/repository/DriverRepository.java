package com.RideSwift.RideSwift.repository;

import com.RideSwift.RideSwift.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver, Integer> {
    Driver findByMobNo(String mobNo);
}