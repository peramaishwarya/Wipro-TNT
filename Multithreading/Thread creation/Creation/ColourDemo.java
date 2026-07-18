public class ColourDemo {

    public static void main(String[] args) {
        Thread t = new Thread(new ColourTask());
        t.start();
    }
}