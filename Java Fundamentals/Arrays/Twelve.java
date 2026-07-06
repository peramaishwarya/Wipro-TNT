import java.util.Scanner;

public class Twelve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[3];
        int b[] = new int[3];
        System.out.println("Enter first array (3 elements):");
        for(int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter second array (3 elements):");
        for(int i = 0; i < 3; i++) {
            b[i] = sc.nextInt();
        }
        int result[] = {a[1], b[1]};
        System.out.println("Middle elements:");
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        sc.close();
    }
}