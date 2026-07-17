package Collection.methodReference;

public class MyClass {

    public static void main(String[] args) {

        Factorial obj = new Factorial();

        Number ref = obj::factorial;

        System.out.println("Factorial = " + ref.operation(5));
    }
}