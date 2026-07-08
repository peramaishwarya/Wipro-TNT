import java.util.Scanner;
import java.util.StringJoiner;

public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of elements in first StringJoiner: ");
        int n1 = sc.nextInt();
        sc.nextLine();
        StringJoiner sj1 = new StringJoiner(", ");
        for (int i = 0; i < n1; i++) {
            System.out.print("Enter element: ");
            sj1.add(sc.nextLine());
        }
        System.out.print("Enter no.of elements in second StringJoiner: ");
        int n2 = sc.nextInt();
        sc.nextLine();
        StringJoiner sj2 = new StringJoiner(", ");
        for (int i = 0; i < n2; i++) {
            System.out.print("Enter element: ");
            sj2.add(sc.nextLine());
        }
        sj1.merge(sj2);
        System.out.println("Merged StringJoiner:");
        System.out.println(sj1);
        sc.close();
    }
}