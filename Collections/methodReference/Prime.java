package Collection.methodReference;

public class Prime {

    public Prime(int n) {

        if (n < 2) {
            System.out.println("Not Prime");
            return;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {
                System.out.println("Not Prime");
                return;
            }
        }

        System.out.println("Prime");
    }
}