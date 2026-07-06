class Sample14 {
    public static void main(String args[]) {
        if (args.length != 1) {
            System.out.println("Please enter a number");
            return;
        }
        int n = Integer.parseInt(args[0]);
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        System.out.println(sum);
    }
}