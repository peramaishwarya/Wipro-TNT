package Collection.list;

import java.util.Vector;

public class EmployeeVector {

    public static void main(String[] args) {

        Vector<Employee> list = new Vector<>();

        list.add(new Employee(101, "Sudhir", "sudhir@gmail.com", "Male", 50000));
        list.add(new Employee(102, "Selvan", "selvan@gmail.com", "Male", 60000));

        for (Employee e : list) {
            e.getEmployeeDetails();
            System.out.println("--------------------");
        }
    }
}