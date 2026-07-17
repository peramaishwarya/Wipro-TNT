
import java.util.*;

public class CardMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Character, ArrayList<Card>> map = new TreeMap<>();
        System.out.println("Enter Number of Cards :");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter card " + i + ":");
            char symbol = sc.next().toLowerCase().charAt(0);
            int number = sc.nextInt();
            Card card = new Card(symbol, number);
            map.putIfAbsent(symbol, new ArrayList<>());
            map.get(symbol).add(card);
        }
        System.out.println("Distinct Symbols are :");
        for (char ch : map.keySet()) {
            System.out.print(ch + " ");
        }
        System.out.println();
        for (char ch : map.keySet()) {
            System.out.println("Cards in " + ch + " Symbol");
            int sum = 0;
            for (Card c : map.get(ch)) {
                System.out.println(c.getSymbol() + " " + c.getNumber());
                sum += c.getNumber();
            }
            System.out.println("Number of cards : " + map.get(ch).size());
            System.out.println("Sum of Numbers : " + sum);
        }
        sc.close();
    }
}