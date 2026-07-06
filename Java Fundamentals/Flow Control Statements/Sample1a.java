class Sample1a {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please enter one integer.");
            return;
        }
        int n = Integer.parseInt(args[0]);
        if (n > 0)
            System.out.println("Positive");
        else if (n < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }
}