import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String firstTwo;
        if (str.length() >= 2)
            firstTwo = str.substring(0, 2);
        else
            firstTwo = str;
        for (int i = 0; i < str.length(); i++) {
            System.out.print(firstTwo);
        }
        sc.close();
    }
}