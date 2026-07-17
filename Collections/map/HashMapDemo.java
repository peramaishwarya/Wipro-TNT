package Collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("AP", "Amaravati");
        map.put("TS", "Hyderabad");
        map.put("KA", "Bangalore");

        System.out.println("Key Exists : " + map.containsKey("AP"));

        System.out.println("Value Exists : " + map.containsValue("Hyderabad"));

        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();

        while (it.hasNext()) {

            Map.Entry<String, String> e = it.next();

            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}