package com.krishna.bikerentalapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krishna.bikerentalapi.model.BikeRental;
import com.krishna.bikerentalapi.service.BikesService;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/bikerent")
public class BikeRentalController {

	@Autowired
	BikesService bikeSeivce;
	
	@PostMapping("/add")
	BikeRental addCustomer(@RequestBody BikeRental bike) {
		return bikeSeivce.addCustomer(bike);
	}
	
	@GetMapping("/detailsall")
	List<BikeRental> getAllCustomers(){
		return bikeSeivce.getallCustomer();
	}
	
	@GetMapping("/customer/{id}")
	BikeRental getCustomer(@PathVariable Integer id) {
		return bikeSeivce.getCustomer(id);
	}
	
	@PutMapping("/update/{id}")
	BikeRental updateCustomerDetails(@RequestBody BikeRental bi,@PathVariable Integer id) {
		return bikeSeivce.updateDetails(bi, id);
	}
	
	@DeleteMapping("/delete/{id}")
	String deleteCustomer(@PathVariable Integer id) {
		bikeSeivce.deleteCustomerbyId(id);
		return "Deleted Sucessfully";
	}
	
}
