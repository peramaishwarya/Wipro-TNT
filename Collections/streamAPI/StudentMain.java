package Collection.streamAPI;

import java.util.ArrayList;

public class StudentMain {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1, "Arun", 70));
        list.add(new Student(2, "Rahul", 45));
        list.add(new Student(3, "Kiran", 90));
        list.add(new Student(4, "Ajay", 50));
        list.add(new Student(5, "Ravi", 35));

        long count = list.stream()
                .filter(s -> s.mark >= 50)
                .count();

        System.out.println("Students Passed : " + count);
    }
}