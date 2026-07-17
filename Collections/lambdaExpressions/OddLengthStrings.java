package Collection.lambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;

public class OddLengthStrings {

    public static void main(String[] args) {

        ArrayList<String> a1 = new ArrayList<>(Arrays.asList(
                "Java",
                "Python",
                "HTML",
                "CSS",
                "SQL",
                "Spring",
                "React",
                "Oracle",
                "JavaScript",
                "Bootstrap"
        ));

        a1.stream()
          .filter(s -> s.length() % 2 != 0)
          .forEach(System.out::println);
    }
}