class Sample15 {
    public static void main(String args[]) {
        if (args.length != 1) {
            System.out.println("Please enter an integer number");
            return;
        }
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; i++) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
        }
    }
}