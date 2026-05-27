package Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import model.Vehicle;

public class VehicleService {
	
	//HashSet<Vehicle> set =new HashSet<>();
	
	HashSet<Vehicle> set=new HashSet<>();
	
//	public void addVehicle(Vehicle v)
//	{
//		set.add(v);
//		
//	}
	
	public void addVehicle(Vehicle v)
	{
		set.add(v);
	}
	
	public void displayAll()
	{
		for(Vehicle v:set)
		{
			System.out.println(v);
		}
	}
	
	public void deleteById(int id)
	{
		set.removeIf(v ->v.getVehicleId()==id);
	}
	
	public void updatePrice(int id,double price)
	{
		for(Vehicle v:set)
		{
			if(v.getVehicleId()==id)
			{
				v.setPrice(price);
			}
		}
	}
	public void serachByName(String name)
	{
		for(Vehicle v:set)
		{
			if(v.getVehicleName().equalsIgnoreCase(name))
			{
				System.out.println(v);
			}
		}
	}
	public void searchById(int id)
	{
		for(Vehicle v:set)
		{
			if(v.getVehicleId()==id)
			{
				System.out.println(v);
			}
		}
	}
	public void sortByPrice()
	{
		List<Vehicle >list=new ArrayList<>(set);
		list.sort((a,b)->Double.compare(a.getPrice(),b.getPrice()));
		list.forEach(System.out::println);
	}
}
