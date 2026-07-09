import java.util.Scanner;

public class SumLastDigits {
    public static int addLastDigits(int input1, int input2) {
        int last1 = Math.abs(input1 % 10);
        int last2 = Math.abs(input2 % 10);
        return last1 + last2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Sum of Last Digits = " + addLastDigits(a, b));
        sc.close();
    }
}