package Collection.lambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseStrings {

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

        a1.sort((s1, s2) -> s2.compareTo(s1));

        a1.forEach(System.out::println);
    }
}