package Collection.map;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class CountryHashTable {

    Hashtable<String, String> M1 = new Hashtable<>();

    public Hashtable<String, String> saveCountryCapital(String country, String capital) {
        M1.put(country, capital);
        return M1;
    }

    public String getCapital(String country) {
        return M1.get(country);
    }

    public String getCountry(String capital) {

        for (Map.Entry<String, String> e : M1.entrySet()) {

            if (e.getValue().equalsIgnoreCase(capital))
                return e.getKey();
        }

        return null;
    }

    public Hashtable<String, String> swapKeyValue() {

        Hashtable<String, String> M2 = new Hashtable<>();

        for (Map.Entry<String, String> e : M1.entrySet()) {
            M2.put(e.getValue(), e.getKey());
        }

        return M2;
    }

    public ArrayList<String> toArrayList() {
        return new ArrayList<>(M1.keySet());
    }
}