package Collection.list;

import java.util.LinkedList;

public class EmployeeLinkedList {

    public static void main(String[] args) {

        LinkedList<Employee> list = new LinkedList<>();

        list.add(new Employee(101, "Sudhir", "sudhir@gmail.com", "Male", 50000));
        list.add(new Employee(102, "Selvan", "selvan@gmail.com", "Male", 60000));

        for (Employee e : list) {
            e.getEmployeeDetails();
            System.out.println("--------------------");
        }
    }
}