public class RaceDemo {

    public static void main(String[] args) {

        RaceThread hare = new RaceThread("Hare");
        RaceThread tortoise = new RaceThread("Tortoise");

        hare.setPriority(Thread.MAX_PRIORITY);
        tortoise.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Starting Hare and Tortoise Race...\n");

        hare.start();
        tortoise.start();

        try {
            hare.join();
            tortoise.join();
        } catch (InterruptedException e) {
        }

        System.out.println("\nWinner is : " + Race.winner);
    }
}