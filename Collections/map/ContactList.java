package Collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ContactList {

    public static void main(String[] args) {

        HashMap<String, Integer> contacts = new HashMap<>();

        contacts.put("Rahul", 987654321);
        contacts.put("Sudhir", 987654322);
        contacts.put("Selvan", 987654323);

        System.out.println("Key Exists : " + contacts.containsKey("Rahul"));

        System.out.println("Value Exists : " + contacts.containsValue(987654321));

        Iterator<Map.Entry<String, Integer>> it = contacts.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Integer> e = it.next();
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}