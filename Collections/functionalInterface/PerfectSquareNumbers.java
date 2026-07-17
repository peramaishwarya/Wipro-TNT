package Collection.FunctionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PerfectSquareNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(9);
        list.add(15);
        list.add(16);
        list.add(20);
        list.add(25);

        Predicate<Integer> p = n -> {
            int r = (int) Math.sqrt(n);
            return r * r == n;
        };

        list.stream()
                .filter(p)
                .forEach(System.out::println);
    }
}