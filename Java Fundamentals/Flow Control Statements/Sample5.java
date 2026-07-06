class Sample5 {
    public static void main(String args[]) {
        if (args.length != 1) {
            System.out.println("Please enter one character");
            return;
        }
        char ch = args[0].charAt(0);
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
            System.out.println("Alphabet");
        else if (ch >= '0' && ch <= '9')
            System.out.println("Digit");
        else
            System.out.println("Special Character");
    }
}