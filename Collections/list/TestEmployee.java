package Collection.list;

public class TestEmployee {

    public static void main(String[] args) {

        EmployeeDB db = new EmployeeDB();

        Employee e1 = new Employee(101,
                "Sudhir",
                "sudhir@gmail.com",
                "Male",
                50000);

        Employee e2 = new Employee(102,
                "Selvan",
                "selvan@gmail.com",
                "Male",
                60000);

        db.addEmployee(e1);
        db.addEmployee(e2);

        System.out.println("All Employees");

        db.displayAll();

        System.out.println(db.showPaySlip(101));

        db.deleteEmployee(102);

        System.out.println("After Deleting Employee");

        db.displayAll();
    }
}