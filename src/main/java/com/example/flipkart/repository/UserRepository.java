package com.example.flipkart.repository;

import com.example.flipkart.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * @Author : Aayush Varshney <aayushv@vmware.com>
 * @Created_on : 22/01/22
 */
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findById(Integer id);
    Optional<User> findByAadhar_number(Long id);
}
