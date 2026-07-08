import java.util.Optional;
import java.util.Scanner;

class Employee {
    int id;
    String name;
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        Employee emp = null;
        if (id != 0) {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            emp = new Employee(id, name);
        }
        try {
            Employee e = Optional.ofNullable(emp)
                    .orElseThrow(() -> new RuntimeException("Employee not found"));
            System.out.println("Employee ID = " + e.id);
            System.out.println("Employee Name = " + e.name);

        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
        sc.close();
    }
}