package com.krishna.bikerentalapi.service;

import java.util.List;

import com.krishna.bikerentalapi.model.BikeRental;

public interface BikesService {

	BikeRental addCustomer(BikeRental bike);
	
	List<BikeRental> getallCustomer();
	
	BikeRental getCustomer(Integer id);
	
	BikeRental updateDetails(BikeRental b,Integer id);
	
	void deleteCustomerbyId(Integer id);
}
