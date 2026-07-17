package Collection.methodReference;

public class MyClass2 {

    public static void main(String[] args) {

        Number ref = DigitCount::digitCount;

        System.out.println("Digits = " + ref.operation(123456));
    }
}