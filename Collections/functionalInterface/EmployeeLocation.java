package Collection.FunctionalInterface;

import java.util.ArrayList;
import java.util.function.Function;

public class EmployeeLocation {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101,"Ravi","Hyderabad",25000));
        list.add(new Employee(102,"Asha","Pune",30000));
        list.add(new Employee(103,"Kiran","Chennai",28000));
        list.add(new Employee(104,"Sneha","Delhi",35000));
        list.add(new Employee(105,"Rahul","Mumbai",40000));

        Function<Employee,String> f = e -> e.getLocation();

        ArrayList<String> locations = new ArrayList<>();

        for(Employee e : list){
            locations.add(f.apply(e));
        }

        System.out.println(locations);
    }
}