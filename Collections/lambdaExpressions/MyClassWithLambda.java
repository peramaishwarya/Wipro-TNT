package Collection.lambdaExpression;

public class MyClassWithLambda {

    public static void main(String[] args) {

        WordCount wc = str -> {
            if (str == null || str.trim().isEmpty())
                return 0;

            return str.trim().split("\\s+").length;
        };

        String s = "Welcome to Wipro TalentNext Java Full Stack";

        System.out.println("Word Count = " + wc.count(s));
    }
}