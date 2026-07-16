import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagement {
    static final String FILE_NAME = "employee.dat";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Main Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Employee Age: ");
                    int age = sc.nextInt();
                    System.out.print("Enter Employee Salary: ");
                    double salary = sc.nextDouble();
                    Employee emp = new Employee(id, name, age, salary);
                    ArrayList<Employee> list = readEmployees();
                    list.add(emp);
                    writeEmployees(list);
                    break;
                case 2:
                    ArrayList<Employee> employees = readEmployees();
                    System.out.println("------Report------");
                    if (employees.isEmpty()) {
                        System.out.println("No Employee Records Found");
                    } else {
                        for (Employee e : employees) {
                            System.out.println(e);
                        }
                    }
                    System.out.println("------End of Report------");
                    break;
                case 3:
                    System.out.println("Exiting the System");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
    static ArrayList<Employee> readEmployees() {
        ArrayList<Employee> list = new ArrayList<>();
        try {
            File file = new File(FILE_NAME);
            if (!file.exists())
                return list;
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            list = (ArrayList<Employee>) in.readObject();
            in.close();
        } catch (Exception e) {
        }
        return list;
    }
    static void writeEmployees(ArrayList<Employee> list) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
            out.writeObject(list);
            out.close();
        } catch (Exception e) {
            System.out.println("Error writing file.");
        }
    }
}