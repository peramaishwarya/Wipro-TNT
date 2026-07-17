package Collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<String> set = new TreeSet<>();

        set.add("India");
        set.add("USA");
        set.add("Japan");
        set.add("Australia");

        System.out.println("Reverse Order");
        System.out.println(set.descendingSet());

        System.out.println("\nUsing Iterator");

        Iterator<String> it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nContains India : " + set.contains("India"));
        System.out.println("Contains China : " + set.contains("China"));
    }
}