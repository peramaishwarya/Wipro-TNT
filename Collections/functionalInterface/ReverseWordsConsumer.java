package Collection.FunctionalInterface;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ReverseWordsConsumer {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("Spring");
        list.add("Oracle");
        list.add("React");

        Consumer<String> c = s ->
                System.out.println(new StringBuilder(s).reverse());

        list.forEach(c);
    }
}