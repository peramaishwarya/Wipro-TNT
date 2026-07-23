import com.automobile.fourwheeler.Ford;
import com.automobile.fourwheeler.Logan;

public class TestFourWheeler {

    public static void main(String[] args) {

        Logan l = new Logan();

        System.out.println("Logan Details");
        System.out.println("Model : " + l.getModelName());
        System.out.println("Registration : " + l.getRegistrationNumber());
        System.out.println("Owner : " + l.getOwnerName());
        System.out.println("Speed : " + l.speed());
        System.out.println("GPS : " + l.gps());

        System.out.println();

        Ford f = new Ford();

        System.out.println("Ford Details");
        System.out.println("Model : " + f.getModelName());
        System.out.println("Registration : " + f.getRegistrationNumber());
        System.out.println("Owner : " + f.getOwnerName());
        System.out.println("Speed : " + f.speed());
        System.out.println("Temperature Control : " + f.tempControl() + "°C");
    }
}