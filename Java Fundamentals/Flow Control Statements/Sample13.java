class Sample13 {
    public static void main(String args[]) {
        for (int i = 10; i <= 99; i++) {
            boolean prime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime)
                System.out.print(i + " ");
        }
    }
}