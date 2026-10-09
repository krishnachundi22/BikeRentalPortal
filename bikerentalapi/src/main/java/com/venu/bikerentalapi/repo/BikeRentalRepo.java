package com.venu.bikerentalapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venu.bikerentalapi.model.BikeRental;

public interface BikeRentalRepo extends JpaRepository<BikeRental, Integer> {

}
