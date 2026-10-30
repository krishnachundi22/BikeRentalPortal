package com.krishna.bikerentalapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krishna.bikerentalapi.model.BikeRental;

public interface BikeRentalRepo extends JpaRepository<BikeRental, Integer> {

}
