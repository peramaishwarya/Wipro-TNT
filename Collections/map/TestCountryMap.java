package Collection.map;

public class TestCountryMap {

    public static void main(String[] args) {

        CountryMap obj = new CountryMap();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        obj.saveCountryCapital("USA", "Washington");

        System.out.println("Capital : " + obj.getCapital("India"));
        System.out.println("Country : " + obj.getCountry("Tokyo"));

        System.out.println(obj.swapKyeValue());

        System.out.println(obj.toArrayList());
    }
}