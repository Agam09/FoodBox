package com.food.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.food.model.Restaurant;

@Repository
public interface RestaurantDAO extends JpaRepository<Restaurant, Integer>{
	
}
