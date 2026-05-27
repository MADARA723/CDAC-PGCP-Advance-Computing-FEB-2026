package Test;

import java.util.Scanner;

import Service.VehicleService;
import model.ElectricVehicle;
import model.PetrolVehicle;

public class VehicleApp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		VehicleService service=new VehicleService();
		
		int ch;
		do{
            System.out.println("1.Add 2.Display 3.Remove 4.Update 5.SearchByName 6.SearchByID 7.sortByprice 8.exit");
            ch=sc.nextInt();
            switch(ch)
            {
            case 1:
            	System.out.println("1.Electric Vehicle 2.Petrol");
            	int type=sc.nextInt();
            	
            	System.out.println("ID name Price:-");
            	int id=sc.nextInt();
            	String name=sc.next();
            	double price=sc.nextDouble();
            	
            	if(type==1)
            	{
            		System.out.println("Battery ,ChargingTime: ");
            		int battery=sc.nextInt();
            		int ChargingTime=sc.nextInt();
            		service.addVehicle(new ElectricVehicle(id,name,price,"Availlable",battery,ChargingTime));
            		
            	}
            	else
            	{
            		System.out.println("fuel Mileage");
            		String fuel=sc.next();
            		int Mileage=sc.nextInt();
            		service.addVehicle(new PetrolVehicle(id,name,price,"Availlable",fuel,Mileage));
            	}
            	
            	break;
            	
            	
            case 2:
            	service.displayAll();
            	break;
            
            case 3:
            	System.out.println("Enter the Vehicle ID to delete: ");
            	service.deleteById(sc.nextInt());
            	break;
            
            case 4:
            
            	System.out.println("Enter the ID to update price and price: ");
            	int id1=sc.nextInt();
            	double price1=sc.nextDouble();
            	
            	service.updatePrice(id1, price1);
            	break;
            
            case 5:
            
            	System.out.println("Enter Name to Search: ");
            	String name1=sc.next();
            	service.serachByName(name1);
            	break;
            
            case 6:
            
            	System.out.println("Enter ID to Search: ");
            	int id2=sc.nextInt();
            	service.searchById(id2);
            	break;
            
            case 7:
            
            	service.sortByPrice();
            	break;
            
            	
            }
		}while(ch!=8);

	}

}
