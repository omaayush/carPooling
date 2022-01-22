package com.example.flipkart.domain;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * @Author : Aayush Varshney <aayushv@vmware.com>
 * @Created_on : 22/01/22
 * {
 *   "user_id": 1,
 *   "vehicle_id": 1,
 *   "start_location": "Bangalore",
 *   "end_location": "Bombay",
 *   "start_time": "11-12-2021 13:00:00",
 *   "expected_duration": 5,
 *   "price": 500
 * }
 */
@Entity
@Slf4j
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Ride {
    private int id;
    private int user_id;
    private int vehicle_id;
    private Location start_location;
    private Location end_location;
    private Timestamp start_time;
    private int expected_duration;
    private int price;
}
