package com.lcwd.hotel.services;

import java.util.List;

import com.lcwd.hotel.entities.Hotel;

public interface HotelService {
	
	//Create
	Hotel create(Hotel hotel);
	
	//Get all hotels
	List<Hotel> getAll();
	
	//Get single hotel
	Hotel get(String id);
	
}
