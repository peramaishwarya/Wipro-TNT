package Collection.methodReference;

public class MyClass3 {

    public static void main(String[] args) {

        PrimeInterface ref = Prime::new;

        ref.create(17);
        ref.create(18);
        ref.create(23);
    }
}