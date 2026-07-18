public class JoinDemo {

    public static void main(String[] args) {

        EvenThread even = new EvenThread();
        OddThread odd = new OddThread();
        even.start();
        try {
            even.join();
        } catch (InterruptedException e) {
        }
        odd.start();
    }
}