package com.amigoscode.user_input;

import java.util.Scanner;

public class PracticeUserInput {

    /**
     * taking User Input Class
     * 1) by using Scanner class come in java.util
     * @Author Tahir Mehboob
     */

    private static void workingWithScannerClass(){
        Scanner scanner = new Scanner(System.in);
       /* System.out.println("Enter Any Number");
        int number = scanner.nextInt();
        System.out.println("You Type "+number);*/

        // working with string
        // next() only read one word after space it skip and print one word
        // nextLine() read one line after enter they skip input
        //String name = scanner.nextLine();
        // input tahir mehboob output tahir mehboob
        //String name = scanner.next();
        // input tahir mehboob output tahir

        String name = scanner.nextLine();
        System.out.println("You Type "+name);
    }


    public static void main(String[] args) {
    workingWithScannerClass();
    }
}
