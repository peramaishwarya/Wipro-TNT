import java.util.Scanner;

class InvalidMarksException extends Exception {
    InvalidMarksException(String msg) {
        super(msg);
    }
}

public class StudentAverage {
    static void validate(int mark) throws InvalidMarksException {
        if (mark < 0)
            throw new InvalidMarksException("Negative values are not allowed");
        if (mark > 100)
            throw new InvalidMarksException("Marks should be between 0 and 100");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            for (int i = 1; i <= 2; i++) {
                System.out.print("Enter Student Name: ");
                String name = sc.nextLine();
                int total = 0;
                for (int j = 1; j <= 3; j++) {
                    System.out.print("Enter Mark " + j + ": ");
                    int mark = Integer.parseInt(sc.nextLine());
                    validate(mark);
                    total += mark;
                }
                System.out.println(name + " Average = " + (total / 3.0));
            }
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception");
        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}