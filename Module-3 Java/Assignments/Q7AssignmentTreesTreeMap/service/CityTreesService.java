package Q7AssignmentTreesTreeMap.service;



import Q7AssignmentTreesTreeMap.dao.CityTreesDAO;
import java.util.*;

public class CityTreesService {

    private CityTreesDAO dao = new CityTreesDAO();
    private Scanner sc = new Scanner(System.in);

    public void addCity() {

        System.out.print("Enter City Name: ");
        String city = sc.next();

        System.out.print("Enter number of trees: ");
        int n = sc.nextInt();

        List<String> trees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter tree name: ");
            trees.add(sc.next());
        }

        if (dao.addCity(city, trees)) {
            System.out.println("City added successfully.");
        } else {
            System.out.println("City already exists!");
        }
    }

    public void findTrees() {

        System.out.print("Enter City Name: ");
        String city = sc.next();

        List<String> trees = dao.getTrees(city);

        if (trees != null) {
            System.out.println("Trees: " + trees);
        } else {
            System.out.println("City not found.");
        }
    }

    public void deleteCity() {

        System.out.print("Enter City Name: ");
        String city = sc.next();

        if (dao.deleteCity(city)) {
            System.out.println("City deleted.");
        } else {
            System.out.println("City not found.");
        }
    }

    public void displayForEach() {

        System.out.println("\n--- Using ForEach ---");

        for (Map.Entry<String, List<String>> entry : dao.getAll().entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public void displayIterator() {

        System.out.println("\n--- Using Iterator ---");

        Iterator<Map.Entry<String, List<String>>> it =
                dao.getAll().entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, List<String>> entry = it.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
