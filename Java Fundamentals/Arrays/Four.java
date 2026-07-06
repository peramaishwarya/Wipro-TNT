import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of ASCII values: ");
        int n = sc.nextInt();
        int[] ascii = new int[n];
        System.out.println("Enter ASCII values:");
        for(int i = 0; i < n; i++) {
            ascii[i] = sc.nextInt();
        }
        System.out.print("Characters: ");
        for(int i = 0; i < n; i++) {
            System.out.print((char)ascii[i] + " ");
        }
        sc.close();
    }
}