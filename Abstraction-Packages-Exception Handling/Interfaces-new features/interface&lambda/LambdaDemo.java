import java.util.Scanner;

public class LambdaDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = Integer.parseInt(sc.nextLine());

            System.out.print("Enter second number: ");
            int b = Integer.parseInt(sc.nextLine());

            System.out.print("Enter third number: ");
            int c = Integer.parseInt(sc.nextLine());

            Test t1 = (x, y, z) -> x + y + z;
            Test t2 = (x, y, z) -> x * y * z;

            System.out.println("Addition = " + t1.myFunction(a, b, c));
            System.out.println("Multiplication = " + t2.myFunction(a, b, c));

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter integers only.");
        }

        sc.close();
    }
}