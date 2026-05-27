package model;

public class ElectricVehicle extends Vehicle{
	private int batteryCapacity;
	private int chargingTime;
	
	
public ElectricVehicle(int vehicleId, String vehicleName, double price, String status, int batteryCapacity,
			int chargingTime) {
		super(vehicleId, vehicleName, price, status);
		this.batteryCapacity = batteryCapacity;
		this.chargingTime = chargingTime;
	}


@Override
public String toString() {
	return super.toString()+"ElectricVehicle [batteryCapacity=" + batteryCapacity + ", chargingTime=" + chargingTime + "]";
}

//	public ElectricVehicle(int vehicleId, String vehicleName, double price, String status,int batteryCapacity, int chargingTime) {
//		super( vehicleId, vehicleName,  price,  status);
//		this.batteryCapacity = batteryCapacity;
//		this.chargingTime = chargingTime;
//	}
//	

	
	
	

}
