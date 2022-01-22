package com.example.flipkart.repository;

import com.example.flipkart.domain.User;
import com.example.flipkart.domain.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @Author : Aayush Varshney <aayushv@vmware.com>
 * @Created_on : 22/01/22
 */
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    Optional<Vehicle> findByPlate_number(String plateNumber);
}
