import java.util.Random;

public class ColourTask implements Runnable {

    @Override
    public void run() {
        String colours[] = {
                "white",
                "blue",
                "black",
                "green",
                "red",
                "yellow"
        };
        Random random = new Random();
        while (true) {
            int index = random.nextInt(colours.length);
            System.out.println(colours[index]);
            if (colours[index].equals("red")) {
                break;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}