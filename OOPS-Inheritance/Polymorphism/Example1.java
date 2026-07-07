class Fruit {
    String name;
    String taste;
    String size;
    Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }
    public void eat() {
        System.out.println("Fruit Name : " + name);
        System.out.println("Taste : " + taste);
    }
}

class Apple extends Fruit {
    Apple() {
        super("Apple", "Sweet", "Medium");
    }
    @Override
    public void eat() {
        System.out.println("Fruit Name : " + name);
        System.out.println("Taste : " + taste);
    }
}

class Orange extends Fruit {
    Orange() {
        super("Orange", "Sour", "Medium");
    }
    @Override
    public void eat() {
        System.out.println("Fruit Name : " + name);
        System.out.println("Taste : " + taste);
    }
}

public class Example1 {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();
        System.out.println("Apple Details");
        apple.eat();
        System.out.println();
        System.out.println("Orange Details");
        orange.eat();
    }
}