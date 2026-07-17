package Collection.FunctionalInterface;

import java.util.ArrayList;
import java.util.function.Function;

public class SumArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);

        Function<ArrayList<Integer>,Integer> sum = l -> {
            int s = 0;
            for(int n : l){
                s += n;
            }
            return s;
        };

        System.out.println("Sum = " + sum.apply(list));
    }
}