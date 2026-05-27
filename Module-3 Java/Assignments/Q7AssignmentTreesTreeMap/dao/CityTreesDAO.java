package Q7AssignmentTreesTreeMap.dao;



import java.util.*;

public class CityTreesDAO {

    // TreeMap → automatically sorted by city name
    private TreeMap<String, List<String>> cityTreeMap = new TreeMap<>();

    public boolean addCity(String city, List<String> trees) {

        if (cityTreeMap.containsKey(city)) {
            return false; // already exists
        }

        cityTreeMap.put(city, trees);
        return true;
    }

    public List<String> getTrees(String city) {
        return cityTreeMap.get(city);
    }

    public boolean deleteCity(String city) {
        return cityTreeMap.remove(city) != null;
    }

    public TreeMap<String, List<String>> getAll() {
        return cityTreeMap;
    }
}