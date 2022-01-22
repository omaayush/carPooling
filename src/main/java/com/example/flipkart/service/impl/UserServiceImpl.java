package com.example.flipkart.service.impl;

import com.example.flipkart.domain.User;
import com.example.flipkart.domain.Vehicle;
import com.example.flipkart.repository.UserRepository;
import com.example.flipkart.repository.VehicleRepository;
import com.example.flipkart.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

/**
 * @Author : Aayush Varshney <aayushv@vmware.com>
 * @Created_on : 22/01/22
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    private VehicleRepository vehicleRepository;

    public UserServiceImpl(UserRepository userRepository, VehicleRepository vehicleRepository) {
        this.userRepository = userRepository;
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public void registerUser(User user) {
        try {
            if (userRepository.findByAadhar_number(user.getAadhar_number()).get() == null) {
                Set<Vehicle> vehicleSet = new HashSet<>();
                for (Vehicle v : user.getVehicles()) {
                    if (vehicleRepository.findByPlate_number(v.getPlate_number()).get() == null && !vehicleSet.contains(v)) {
                        vehicleSet.add(v);
                    } else {
                        log.error("No 2 vehicles should have same plate_number");
                    }
                    userRepository.save(user);
                }
            } else {
                log.error("User already Exist \n No 2 users should have same aadhar number");
            }
        } catch (Exception e){
            log.error("caught exception - {}",e);
        }

    }

    @Override
    public boolean validateUserAndVehicle(int userId, int vehicleId) {
        User user = userRepository.findById(userId).get();
        if(user != null){
            for(Vehicle v:user.getVehicles()){
                if(v.getId() == vehicleId)
                    return  true;
            }
        }
        return false;
    }
}
