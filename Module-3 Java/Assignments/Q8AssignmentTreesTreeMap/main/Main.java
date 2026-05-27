package Q8AssignmentTreesTreeMap.main;



import Q8AssignmentTreesTreeMap.service.CityTreesService;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	  

    	        Scanner sc = new Scanner(System.in);
    	        CityTreesService service = new CityTreesService();

    	        while (true) {

    	            System.out.println("\n--- MENU ---");
    	            System.out.println("1. Add City");
    	            System.out.println("2. Find Trees");
    	            System.out.println("3. Delete City");
    	            System.out.println("4. Display All");
    	            System.out.println("5. Add Tree to Existing City");
    	            System.out.println("6. Find Cities by Tree");
    	            System.out.println("7. Exit");

    	            int choice = sc.nextInt();

    	            switch (choice) {

    	                case 1:
    	                    service.addCity();
    	                    break;

    	                case 2:
    	                    service.findTrees();
    	                    break;

    	                case 3:
    	                    service.deleteCity();
    	                    break;

    	                case 4:
    	                    service.displayForEach();
    	                    break;

    	                case 5:
    	                    service.addTreeToCity();
    	                    break;

    	                case 6:
    	                    service.findCitiesByTree();
    	                    break;

    	                case 7:
    	                    System.out.println("Exiting...");
    	                    return;

    	                default:
    	                    System.out.println("Invalid choice");
    	            }
    	        }
    	    }
    	}