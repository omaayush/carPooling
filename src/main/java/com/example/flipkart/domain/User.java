package com.example.flipkart.domain;

import lombok.*;
import lombok.extern.slf4j.Slf4j;


import javax.persistence.Entity;
import java.util.List;

/**
 * @Author : Aayush Varshney <aayushv@vmware.com>
 * @Created_on : 22/01/22
 */
@Entity
@Slf4j
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    private int id;
    private String name;
    private int age;
    private long aadhar_number;
    private List<Vehicle> vehicles;
}
