import java.util.Optional;
import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter address (or type null): ");
        String address = sc.nextLine();
        if (address.equalsIgnoreCase("null"))
            address = null;
        String result = Optional.ofNullable(address)
                                .orElse("India");
        System.out.println("Address = " + result);
        sc.close();
    }
}