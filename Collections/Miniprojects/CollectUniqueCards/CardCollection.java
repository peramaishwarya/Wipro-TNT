import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CardCollection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Card> cards = new ArrayList<>();
        boolean[] present = new boolean[26];
        int uniqueCount = 0;
        int totalCards = 0;
        while (uniqueCount < 4) {
            System.out.println("Enter a card :");
            char symbol = sc.next().charAt(0);
            int number = sc.nextInt();
            totalCards++;
            int index = symbol - 'a';
            if (!present[index]) {
                present[index] = true;
                uniqueCount++;
                cards.add(new Card(symbol, number));
            }
        }
        Collections.sort(cards);
        System.out.println("Four symbols gathered in " + totalCards + " cards.");
        System.out.println("Cards in Set are :");
        for (Card c : cards) {
            System.out.println(c.getSymbol() + " " + c.getNumber());
        }
        sc.close();
    }
}