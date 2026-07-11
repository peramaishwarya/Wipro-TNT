class InvalidAgeException extends Exception {

    InvalidAgeException(String msg) {
        super(msg);
    }
}

public class AgeValidation {
    static void validate(int age) throws InvalidAgeException {
        if (age < 18 || age > 59) {
            throw new InvalidAgeException("Age should be between 18 and 59");
        }
    }
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                System.out.println("Usage: java AgeValidation <Name> <Age>");
                return;
            }
            String name = args[0];
            int age = Integer.parseInt(args[1]);
            validate(age);
            System.out.println("Name : " + name);
            System.out.println("Age : " + age);
        } catch (NumberFormatException e) {
            System.out.println("Age should be an integer");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}