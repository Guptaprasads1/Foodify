package com.online.foodDelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.foodDelivery.model.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
