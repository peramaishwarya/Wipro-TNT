public class PriorityDemo extends Thread {

    public PriorityDemo(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " : " + i);
        }
    }

    public static void main(String[] args) {

        PriorityDemo max = new PriorityDemo("MAX");
        PriorityDemo norm = new PriorityDemo("NORM");
        PriorityDemo min = new PriorityDemo("MIN");

        max.setPriority(Thread.MAX_PRIORITY);
        norm.setPriority(Thread.NORM_PRIORITY);
        min.setPriority(Thread.MIN_PRIORITY);

        max.start();
        norm.start();
        min.start();
    }
}