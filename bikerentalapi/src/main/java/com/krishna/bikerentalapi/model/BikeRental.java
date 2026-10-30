package com.krishna.bikerentalapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	public String getBikeNumber() {
		return bikeNumber;
	}
	public void setBikeNumber(String bikeNumber) {
		this.bikeNumber = bikeNumber;
	}
	public String getBikeModel() {
		return bikeModel;
	}
	public void setBikeModel(String bikeModel) {
		this.bikeModel = bikeModel;
	}
	public double getRentForHour() {
		return rentForHour;
	}
	public void setRentForHour(double rentForHour) {
		this.rentForHour = rentForHour;
	}
	public Integer getNoofHours() {
		return noofHours;
	}
	public void setNoofHours(Integer noofHours) {
		this.noofHours = noofHours;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getRentalStatus() {
		return rentalStatus;
	}
	public void setRentalStatus(String rentalStatus) {
		this.rentalStatus = rentalStatus;
	}
	
	

}
