package com.online.foodDelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online.foodDelivery.model.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long>{

}
