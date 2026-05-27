package model;

public class PetrolVehicle extends Vehicle {
	private String fuelType;
	private int mileage;
	public PetrolVehicle(int vehicleId, String vehicleName, double price, String status,String fuelType, int mileage) {
		super( vehicleId,  vehicleName,  price,  status);
		this.fuelType = fuelType;
		this.mileage = mileage;
	}
	@Override
	public String toString() {
		return super.toString()+ "PetrolVehicle [fuelType=" + fuelType + ", mileage=" + mileage + "]";
	}
	

}
