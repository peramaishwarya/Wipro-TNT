package Collection.FunctionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeSalaryFilter {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Ravi", "Hyderabad", 8000));
        list.add(new Employee(102, "Asha", "Pune", 12000));
        list.add(new Employee(103, "Kiran", "Chennai", 9500));
        list.add(new Employee(104, "Sneha", "Delhi", 15000));
        list.add(new Employee(105, "Rahul", "Mumbai", 7000));

        Predicate<Employee> p = e -> e.getSalary() < 10000;

        list.stream()
                .filter(p)
                .forEach(e -> System.out.println(e.getName()));
    }
}