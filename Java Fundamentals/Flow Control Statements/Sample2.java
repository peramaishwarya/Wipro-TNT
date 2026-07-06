class Sample2 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please enter one integer.");
            return;
        }
        int n = Integer.parseInt(args[0]);
        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}