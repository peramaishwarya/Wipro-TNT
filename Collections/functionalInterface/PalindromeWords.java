package Collection.FunctionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PalindromeWords {

    public static boolean isPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        return s.equalsIgnoreCase(rev);
    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("madam");
        list.add("hello");
        list.add("level");
        list.add("java");
        list.add("radar");
        list.add("apple");
        list.add("noon");
        list.add("car");
        list.add("racecar");
        list.add("book");

        Predicate<String> p = PalindromeWords::isPalindrome;

        list.stream().filter(p).forEach(System.out::println);
    }
}