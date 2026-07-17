package Collection.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Arun", 22, "Pune"));
        list.add(new Employee(102, "Rahul", 24, "Hyderabad"));
        list.add(new Employee(103, "Kiran", 25, "Pune"));
        list.add(new Employee(104, "Ajay", 23, "Delhi"));
        list.add(new Employee(105, "Ravi", 26, "Pune"));

        List<Employee> result = list.stream()
                .filter(e -> e.location.equalsIgnoreCase("Pune"))
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}