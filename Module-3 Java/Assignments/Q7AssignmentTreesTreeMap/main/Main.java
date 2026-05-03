package Q7AssignmentTreesTreeMap.main;



import Q7AssignmentTreesTreeMap.service.CityTreesService;
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
            System.out.println("4. Display (ForEach)");
            System.out.println("5. Display (Iterator)");
            System.out.println("6. Exit");

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
                    service.displayIterator();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}