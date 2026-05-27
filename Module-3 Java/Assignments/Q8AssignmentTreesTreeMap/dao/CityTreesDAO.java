package Q8AssignmentTreesTreeMap.dao;



import java.util.*;

public class CityTreesDAO {

    // TreeMap → automatically sorted by city name
	private TreeMap<String, List<String>> cityTreeMap = new TreeMap<>();

    public boolean addCity(String city, List<String> trees) {
        if (cityTreeMap.containsKey(city)) return false;
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

    // 🔥 NEW: Add tree to existing city
    public boolean addTreeToCity(String city, String tree) {

        List<String> trees = cityTreeMap.get(city);

        if (trees == null) return false;

        trees.add(tree);
        return true;
    }

    // 🔥 NEW: Find cities containing a tree
    public List<String> findCitiesByTree(String treeName) {

        List<String> cities = new ArrayList<>();

        for (Map.Entry<String, List<String>> entry : cityTreeMap.entrySet()) {
            if (entry.getValue().contains(treeName)) {
                cities.add(entry.getKey());
            }
        }

        return cities;
    }
}