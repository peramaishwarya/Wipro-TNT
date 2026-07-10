import com.wipro.automobile.ship.Compartment;

public class TestCompartment {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Usage: java TestCompartment <height> <width> <breadth>");
            return;
        }
        double height = Double.parseDouble(args[0]);
        double width = Double.parseDouble(args[1]);
        double breadth = Double.parseDouble(args[2]);
        Compartment c = new Compartment(height, width, breadth);
        c.display();
    }
}