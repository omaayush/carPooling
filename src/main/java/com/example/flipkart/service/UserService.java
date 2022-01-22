package com.example.flipkart.service;

import com.example.flipkart.domain.User;

/**
 * @Author : Aayush Varshney <aayushv@vmware.com>
 * @Created_on : 22/01/22
 */
public interface UserService {
    void registerUser(User user);
    boolean validateUserAndVehicle(int userId, int vehicleId);
}
