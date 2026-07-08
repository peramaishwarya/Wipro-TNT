import java.util.Optional;
import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string (or type null): ");
        String input = sc.nextLine();
        if (input.equalsIgnoreCase("null"))
            input = null;
        Optional<String> op = Optional.ofNullable(input);
        if (op.isPresent()) {
            System.out.println("String = " + op.get());
            System.out.println("Length = " + op.get().length());
        } else {
            System.out.println("Value is null");
        }
        sc.close();
    }
}