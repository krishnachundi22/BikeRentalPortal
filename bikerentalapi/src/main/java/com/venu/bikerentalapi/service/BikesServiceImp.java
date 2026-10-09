package com.venu.bikerentalapi.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.venu.bikerentalapi.model.BikeRental;
import com.venu.bikerentalapi.repo.BikeRentalRepo;

@Service
public class BikesServiceImp implements BikesService {

	@Autowired
	BikeRentalRepo bikeRentalRepo;
	
	@Override
	public BikeRental addCustomer(BikeRental bike) {
		return bikeRentalRepo.save(bike);
	}

	@Override
	public List<BikeRental> getallCustomer() {
		return bikeRentalRepo.findAll();
	}

	@Override
	public BikeRental getCustomer(Integer id) {
		return bikeRentalRepo.findById(id).get();
	}

	@Override
	public BikeRental updateDetails(BikeRental b, Integer id) {
		BikeRental bikeinfo=getCustomer(id);
		bikeinfo.setAmount(b.getAmount());
		bikeinfo.setNoofHours(b.getNoofHours());
		return bikeRentalRepo.save(b);
	}

	@Override
	public void deleteCustomerbyId(Integer id) {
		 bikeRentalRepo.deleteById(id);
		
	}

}
