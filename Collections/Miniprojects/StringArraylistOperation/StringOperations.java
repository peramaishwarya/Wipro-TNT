

import java.util.*;

public class StringOperations {

    public static ArrayList<String> operations(String s1, String s2) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder r1 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0) {
                r1.append(s2);
            } else {
                r1.append(s1.charAt(i));
            }
        }
        list.add(r1.toString());

        int first = s1.indexOf(s2);
        int last = s1.lastIndexOf(s2);

        if (first != last && first != -1) {
            String rev = new StringBuilder(s2).reverse().toString();
            list.add(s1.substring(0, last) + rev + s1.substring(last + s2.length()));
        } else {
            list.add(s1 + s2);
        }

        if (first != last && first != -1) {
            list.add(s1.substring(0, first) + s1.substring(first + s2.length()));
        } else {
            list.add(s1);
        }

        int mid = (s2.length() + 1) / 2;
        list.add(s2.substring(0, mid) + s1 + s2.substring(mid));

        StringBuilder r5 = new StringBuilder(s1);
        for (int i = 0; i < r5.length(); i++) {
            if (s2.indexOf(r5.charAt(i)) != -1) {
                r5.setCharAt(i, '*');
            }
        }
        list.add(r5.toString());
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter S1: ");
        String s1 = sc.nextLine();

        System.out.print("Enter S2: ");
        String s2 = sc.nextLine();

        ArrayList<String> result = operations(s1, s2);
        System.out.println(result);
        sc.close();
    }
}