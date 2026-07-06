class Sample17 {
    public static void main(String args[]) {
        if (args.length != 1) {
            System.out.println("Please enter a number");
            return;
        }
        int n = Integer.parseInt(args[0]);
        int temp = n;
        int rev = 0;
        while (temp > 0) {
            rev = rev * 10 + (temp % 10);
            temp = temp / 10;
        }
        if (n == rev)
            System.out.println(n + " is a palindrome");
        else
            System.out.println(n + " is not a palindrome");
    }
}