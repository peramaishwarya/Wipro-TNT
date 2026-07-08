import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int index = str.indexOf('*');
        String result = "";
        if (index > 0)
            result += str.substring(0, index - 1);
        if (index < str.length() - 2)
            result += str.substring(index + 2);
        System.out.println(result);
        sc.close();
    }
}