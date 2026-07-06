import java.util.Scanner;
class Box {
    double width;
    double height;
    double depth;
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    double getVolume() {
        return width * height * depth;
    }
}
public class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width: ");
        double width = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        System.out.print("Enter depth: ");
        double depth = sc.nextDouble();
        Box box = new Box(width, height, depth);
        System.out.println("\nWidth  : " + width);
        System.out.println("Height : " + height);
        System.out.println("Depth  : " + depth);
        System.out.println("Volume : " + box.getVolume());
        sc.close();
    }
}