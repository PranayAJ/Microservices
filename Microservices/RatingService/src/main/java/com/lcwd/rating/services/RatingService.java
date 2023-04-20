package com.lcwd.rating.services;

import java.util.List;

import com.lcwd.rating.entities.Rating;

public interface RatingService {
	//Create 
	
	Rating create(Rating rating);
	
	// Get all ratings
	
	List<Rating> getRatings();
	
	// Get all by userId
	
	List<Rating> getRatingByUserId(String userId);
	
	// Get all by hotelId
	
	List<Rating> getRatingByHotelId(String hotelId);
}

