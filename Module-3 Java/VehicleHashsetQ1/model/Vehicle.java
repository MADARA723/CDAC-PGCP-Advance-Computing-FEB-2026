package model;

import java.util.Objects;

//Q1. Design Java application for the following: Create a class Vehicle to store following details vehicleId, vehicleName, price, status
//Vehicles are of 2 types Electric Vehicle, Petrol Vehicle
//For Electric Vehicle store batteryCapacity, chargingTime For Petrol Vehicle add fuelType and mileage
//Store details of vehicles in a HashSet, 2 vehicles cannot have same vehicleId.
//Display following menu 
//a. Add new Vehicle
//b. Remove vehicle using vehicleId
//c. Update vehicle price 
//d. Sell vehicle 
//e. Purchase vehicle
//f. Display all vehicles
//g. Display vehicles by type 
//h. Display vehicles within price range 
//i. Sort vehicles by price 
//j. Search vehicle by name
//k. Exit

public class Vehicle {

	protected int vehicleId;
	protected String vehicleName;
	protected double price;
	protected String status;
	

	public Vehicle(int vehicleId, String vehicleName, double price, String status) {
		
		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
		this.price = price;
		this.status = status;
	}
	
	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", vehicleName=" + vehicleName + ", price=" + price + ", status="
				+ status + "]";
	}

	@Override
	public int hashCode() {
		return vehicleId;
	}

	@Override
	public boolean equals(Object obj) {
		
		Vehicle other = (Vehicle) obj;
		return vehicleId == other.vehicleId;
	}

	
	
	

//	@Override
//	public int hashCode() {
//		return vehicleId;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		
//		Vehicle other = (Vehicle) obj;
//		return this.vehicleId==other.vehicleId;
//	}
	
}
