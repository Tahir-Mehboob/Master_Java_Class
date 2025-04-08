package com.amigoscode;

import com.amigoscode.loopandarrays.LoopsAndArrays_Exercise;

import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello Java ");
        System.out.println(10+10);

        // Primitivies
        int number1 = 20;
        int number2= 40;

        int result= number1 + number2;
        System.out.println(result);
        double pi = 3.1415;
        boolean isAult = true;
        char a = 'B';
        System.out.println(result);
        System.out.println(pi);
        System.out.println(isAult);
        System.out.println(a);

        int myNumber = 1_000_000_008;
        System.out.println(myNumber);

        //String

         String myVariable = "Taha Application";
        System.out.println(myVariable.toUpperCase());
        System.out.println(myVariable.toLowerCase());
        System.out.println(myVariable.charAt(3)); // return character
        System.out.println("        ".isBlank()); // return boolean
        System.out.println("        ".isEmpty()); // return boolean
        System.out.println(myVariable.substring(5));
        System.out.println(myVariable.substring(0,5));
        System.out.println(myVariable.substring(5,9));
        System.out.println("      Tap  " .trim());

        ///////
        String str1 = ""; // Empty string
        String str2 = "   "; // Whitespace only
        String str3 = "Hello";

        System.out.println(str1.isEmpty()); // true
        System.out.println(str1.isBlank()); // true

        System.out.println(str2.isEmpty()); // false
        System.out.println(str2.isBlank());
        // true

        System.out.println(str3.isEmpty()); // false
        System.out.println(str3.isBlank());
        // false

        /// pass by value
        // java is alway pass by value

        int age = 24;
        int ageCopy = increment(age);

        System.out.println("\n\n age "+age);
        System.out.println("Copy age "+ageCopy);
        System.out.println("test age "+age);

        // Testing pass by reference
      //  passByReference();

        // Tesing Arrays

       // arraysPractice();

        // calling exercise class

        Basic_Exercise e1 = new Basic_Exercise();
       // System.out.println( e1.compareTwoStringConstents("Tahir","tahir"));

        // Capital letter of any word
     //   e1.firstLetterCapitalOfAnyWord("tahir");

        //calling 2nd appraoch of capital letter of any word

      //  e1.capitalLetterOfAnyWord("owl");

        // print the table
        //e1.printingTable(3,5);

        System.out.println();
        //e1.printingArrayElements();

        System.out.println();

        // WHILE LOOP
        //e1.practiceWhileLoop();

        // do While Loop
       // e1.practiceDoWhileLoop();


        // exercise practice Loops and Arrays
        System.out.println("Arrays Practice Exercise \n");
        LoopsAndArrays_Exercise l1   = new LoopsAndArrays_Exercise();
        l1.emptyArrayPractice();

        System.out.println("After");

        l1.fillTheEmptyArrayWithNumber();

        // Task 3
        System.out.println("\nExercise # 3");

        l1.reassignTheValue();

        // Task # 4
        System.out.println("\nExercise # 4");
        l1.reassignIndexValue();

        // Task # 5
        System.out.println("\nExercise # 5");
        l1.stringArrayExample();

        // Task # 6

        l1.printArrayExercise6();

        // Task # 8
        l1.loopPrintInAscendingOrder();

        // Task # 9
        l1.loopPrintInDescendingOrder();

        // Task # 10
        l1.addingAllNumberIntoArray();

        // Task # 12
        l1.arrayWordsCapital();

        // Task # 13
        l1.arrayFirstLetterCapital();

        // Task # 13 2nd approach
        l1.arrayFirstWordLetterCapital();

        // Task # 14
        l1.reverseArray();


        // Task # 15
        l1.stringToArraySumTotal();
    }


    // create a method for increment the varaible
    static int increment(int age){
        return  ++age;
    }

    // pass by reference example

    static void passByReference(){
        Point p1 = new Point(100,200);
        Point p2 = p1; // p2 store values as well as address of p1 if p2 changes the values it reflect in p1

        System.out.println("Before  \nThe value of p1 is "+p1.x+" and "+p1.y);
        System.out.println("The Value of p2 is "+p2.x+" and "+p2.y);

        // after changing the value of p2
        p2.x = 500;
        p2.y = 300;

        System.out.println("After \n The value of p1 is "+p1.x+" and "+p1.y);
        System.out.println("The value of p2 is "+p2.x+" and "+p2.y);

    }

    // Arrays
    static void arraysPractice(){

        int[] numbers = new int[3];

        numbers[0] = 12;
        numbers[1] = 20;
        numbers[2] = 40;

        System.out.println("length of Arrays "+numbers.length);
        System.out.println(Arrays.toString(numbers));
        numbers[2] = 45;
        System.out.println(numbers[2]);

        // printing array with for each loop
        for( int num : numbers){
            System.out.println(num);
        }

        // another way to declear array

        int[] myNumber = {6,7,2,6,32,66,88,55,34,22};
        System.out.println("\n"+Arrays.toString(myNumber));
        System.out.println(myNumber.length+"\n\n\n");

        String[] names = {"Tata","Taha","Ohio","Polo"};

        // printing the elements of an arrays with the help of steam api
        System.out.println("Before Sorting ");
        Arrays.stream(names).forEach(System.out::print);

        Arrays.sort(names);
        System.out.println();

        Arrays.stream(names).forEach(System.out::print);

        /// Null or 0 values in Array
        // 0 is for primitives default storage
        // null is for reference default storage

        int num [] = new int[3];
        System.out.println("\n\n"+Arrays.toString(num));
        // after filling the default number in the array
        Arrays.fill(num,-1);
        num[1] = 12;
        System.out.println("\n After filling the default number "+Arrays.toString(num));

        // for Reference type
        String[] namess = new String[3];
        System.out.println("\n\n"+Arrays.toString(namess));
        Arrays.fill(namess,"noBuddy");
        Arrays.sort(namess);
        namess[2] = "Arif";
        System.out.println("\n"+Arrays.toString(namess));

    }


}