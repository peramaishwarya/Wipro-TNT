package Collection.FunctionalInterface;

import java.util.function.Supplier;

public class PrimeSupplier {

    static int number = 2;

    public static void main(String[] args) {

        Supplier<Integer> supplier = () -> {

            while (true) {

                int n = number++;
                boolean prime = true;

                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        prime = false;
                        break;
                    }
                }

                if (prime)
                    return n;
            }
        };

        for (int i = 0; i < 10; i++) {
            System.out.println(supplier.get());
        }
    }
}