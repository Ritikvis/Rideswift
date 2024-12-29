package com.RideSwift.RideSwift.repository;

import com.RideSwift.RideSwift.Enum.Gender;
import com.RideSwift.RideSwift.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByEmailId(String emailId);

    List<Customer> getByGenderAndAgeGreaterThan(Gender gender, int age);
}
