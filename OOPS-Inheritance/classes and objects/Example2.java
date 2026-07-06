import java.util.Scanner;

class Calculator {
    static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }
    static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }
}
public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer base: ");
        int intBase = sc.nextInt();
        System.out.print("Enter integer exponent: ");
        int intExp = sc.nextInt();
        System.out.println("Result = " + Calculator.powerInt(intBase, intExp));
        System.out.print("\nEnter double base: ");
        double doubleBase = sc.nextDouble();
        System.out.print("Enter exponent: ");
        int doubleExp = sc.nextInt();
        System.out.println("Result = " + Calculator.powerDouble(doubleBase, doubleExp));
        sc.close();
    }
}