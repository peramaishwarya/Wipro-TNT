import java.util.Scanner;

public class TestClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        String name= sc.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();
        Employee original = new Employee(id, name, salary);
        Employee clone = (Employee) original.clone();

        System.out.println("\nEnter New Details for Original Employee");
        
        System.out.print("Enter Employee ID: ");
        original.id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        original.name = sc.nextLine();
        System.out.print("Enter Employee Salary: ");
        original.salary = sc.nextDouble();
        System.out.println("\nOriginal Employee");
        original.display();
        System.out.println("\nCloned Employee");
        clone.display();

        sc.close();
    }
}