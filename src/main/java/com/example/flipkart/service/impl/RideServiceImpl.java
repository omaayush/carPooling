package com.example.flipkart.service.impl;

import com.example.flipkart.domain.Ride;
import com.example.flipkart.repository.RideRepository;
import com.example.flipkart.service.RideService;
import com.example.flipkart.service.UserService;

/**
 * @Author : Aayush Varshney <aayushv@vmware.com>
 * @Created_on : 22/01/22
 */
public class RideServiceImpl implements RideService {
    private RideRepository rideRepository;
    private UserService userService;

    public RideServiceImpl(RideRepository rideRepository, UserService userService) {
        this.rideRepository = rideRepository;
        this.userService = userService;
    }

    @Override
    public void createRide(Ride ride) {
        boolean validUserAndVehicle = userService.validateUserAndVehicle(ride.getUser_id(), ride.getVehicle_id());
        if(validUserAndVehicle){

        } else {

        }

    }
}
