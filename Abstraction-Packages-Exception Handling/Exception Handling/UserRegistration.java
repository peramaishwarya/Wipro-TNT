import java.util.Scanner;

class InvalidCountryException extends Exception {
    InvalidCountryException(String msg) {
        super(msg);
    }
}

public class UserRegistration {
    void registerUser(String username, String userCountry)
            throws InvalidCountryException {
        if (!userCountry.equalsIgnoreCase("India"))
            throw new InvalidCountryException(
                    "User Outside India cannot be registered");
        System.out.println("User registration done successfully");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Country: ");
        String country = sc.nextLine();
        UserRegistration obj = new UserRegistration();
        try {
            obj.registerUser(name, country);
        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}