package Collection.set;

import java.util.HashSet;

public class Country {

    HashSet<String> H1 = new HashSet<>();

    public HashSet<String> saveCountryNames(String countryName) {
        H1.add(countryName);
        return H1;
    }

    public String getCountry(String countryName) {

        for (String c : H1) {
            if (c.equalsIgnoreCase(countryName)) {
                return c;
            }
        }

        return null;
    }
}