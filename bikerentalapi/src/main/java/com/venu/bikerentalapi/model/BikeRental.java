package com.venu.bikerentalapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class BikeRental {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;

	String customerName;
	String customerPhone;
	String bikeNumber;
	String bikeModel;
	double rentForHour;
	Integer noofHours;
	double amount;
	String rentalStatus;

}
