import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EmployeeSerialization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Date of Birth (dd-MM-yyyy): ");
            String dob = sc.nextLine();
            System.out.print("Enter Department: ");
            String department = sc.nextLine();
            System.out.print("Enter Designation: ");
            String designation = sc.nextLine();
            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();
            Date date = new SimpleDateFormat("dd-MM-yyyy").parse(dob);
            Employee emp = new Employee(name, date, department, designation, salary);
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data"));
            out.writeObject(emp);
            out.close();
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("data"));
            Employee e = (Employee) in.readObject();
            in.close();
            System.out.println();
            System.out.println("Employee Details");
            System.out.println("Name: " + e.getName());
            System.out.println("Date of Birth: " + new SimpleDateFormat("dd-MM-yyyy").format(e.getDateOfBirth()));
            System.out.println("Department: " + e.getDepartment());
            System.out.println("Designation: " + e.getDesignation());
            System.out.println("Salary: " + e.getSalary());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}