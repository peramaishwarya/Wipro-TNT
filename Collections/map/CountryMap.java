package Collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountryMap {

    HashMap<String, String> M1 = new HashMap<>();

    public HashMap<String, String> saveCountryCapital(String country, String capital) {
        M1.put(country, capital);
        return M1;
    }

    public String getCapital(String country) {
        return M1.get(country);
    }

    public String getCountry(String capital) {

        for (Map.Entry<String, String> e : M1.entrySet()) {

            if (e.getValue().equalsIgnoreCase(capital)) {
                return e.getKey();
            }
        }

        return null;
    }

    public HashMap<String, String> swapKyeValue() {

        HashMap<String, String> M2 = new HashMap<>();

        for (Map.Entry<String, String> e : M1.entrySet()) {
            M2.put(e.getValue(), e.getKey());
        }

        return M2;
    }

    public ArrayList<String> toArrayList() {

        return new ArrayList<>(M1.keySet());
    }
}