package app;

import test.Foundation;

public class TestAccess {
    public static void main(String[] args) {
        Foundation f = new Foundation();

        System.out.println("Public Variable : " + f.var4);

        System.out.println("Private Variable : Not Accessible");
        System.out.println("Default Variable : Not Accessible");
        System.out.println("Protected Variable : Not Accessible");
    }
}