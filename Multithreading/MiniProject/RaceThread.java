public class RaceThread extends Thread {

    public RaceThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 1; i <= 100; i++) {

            if (Race.raceOver) {
                return;
            }

            System.out.println(getName() + " : " + i + " meters");

            if (getName().equals("Hare") && i == 60) {

                System.out.println("\nHare is taking a nap for 1000 milliseconds...\n");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
            }

            if (i == 100 && !Race.raceOver) {

                Race.raceOver = true;
                Race.winner = getName();

                System.out.println("\n*****************************");
                System.out.println(getName() + " Wins the Race!");
                System.out.println("*****************************");
            }
        }
    }
}