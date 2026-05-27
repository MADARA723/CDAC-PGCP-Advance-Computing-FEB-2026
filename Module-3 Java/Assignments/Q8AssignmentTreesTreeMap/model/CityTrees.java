package Q8AssignmentTreesTreeMap.model;



import java.util.List;

public class CityTrees {

    private String cityName;
    private List<String> trees;

    public CityTrees(String cityName, List<String> trees) {
        this.cityName = cityName;
        this.trees = trees;
    }

    public String getCityName() {
        return cityName;
    }

    public List<String> getTrees() {
        return trees;
    }
}