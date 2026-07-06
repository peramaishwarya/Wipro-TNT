class Sample7 {
    public static void main(String args[]) {
        if (args.length != 1) {
            System.out.println("Please enter one alphabet");
            return;
        }
        char ch = args[0].charAt(0);
        if (Character.isLowerCase(ch)) {
            System.out.println(ch + " -> " + Character.toUpperCase(ch));
        } 
        else if (Character.isUpperCase(ch)) {
            System.out.println(ch + " -> " + Character.toLowerCase(ch));
        } 
        else {
            System.out.println("Invalid Input");
        }
    }
}