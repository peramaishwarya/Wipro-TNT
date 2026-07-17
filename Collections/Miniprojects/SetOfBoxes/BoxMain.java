`

import java.util.*;

public class BoxMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Box> set = new TreeSet<>(Comparator.comparingDouble(Box::getVolume));

        System.out.println("Enter the number of Box");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the Box " + i + " details");

            System.out.println("Enter Length");
            double l = sc.nextDouble();

            System.out.println("Enter Width");
            double w = sc.nextDouble();

            System.out.println("Enter Height");
            double h = sc.nextDouble();

            set.add(new Box(l, w, h));
        }

        System.out.println("Unique Boxes in the Set are");

        for (Box b : set) {
            System.out.printf("Length =%.1f Width =%.1f Height =%.1f Volume =%.2f%n",
                    b.getLength(),
                    b.getWidth(),
                    b.getHeight(),
                    b.getVolume());
        }

        sc.close();
    }
}