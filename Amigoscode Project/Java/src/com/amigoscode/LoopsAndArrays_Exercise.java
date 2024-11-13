package com.amigoscode;

import java.util.Arrays;

public class LoopsAndArrays_Exercise {

     // Exercise  #1

    static void emptyArrayPractice(){
        // declare an empty integer array of length = 3
        int[] numbers = new int[3];

        // 1st method for print the contents to the console
        System.out.println(Arrays.toString(numbers));

        // 2nd method to printing the elements in the console

        for(int i=0; i<numbers.length ; i++){
            System.out.println(numbers[i]);
        }
    }


    // Exercise # 2
    // fill the empty array with number 4

    static void fillTheEmptyArrayWithNumber() {

        // declare an empty Array
        int[] number = new int[3];
        System.out.println("before filling an array " + Arrays.toString(number));
        // after filling an array with number 4
        Arrays.fill(number, 4);
        // print in the console
        System.out.println("After filling the number " + Arrays.toString(number));

        //2nd way to fill the number with the help of loop
        for (int i = 0; i < number.length; i++) {
            number[i] = 8;
        }
        // print an array with help of loop
        System.out.println("2nd method for filling and printing the elements");
        for (int i = 0; i < number.length; i++) {
            System.out.print("[" + number[i] + "]");
        }
    }

    // Exercise # 3
    // reassign the second value in the array to the number `17`

    static void reassignTheValue(){
        int[] numbers = new int[3];

        // fill the array element
        Arrays.fill(numbers,4);
        System.out.println("before reassign the second the value "+Arrays.toString(numbers));
        numbers[1] = 17;

        // printing the element
        System.out.println("After reassign the second the value "+Arrays.toString(numbers));
    }

    // exercise # 4
    static  void reassignIndexValue(){
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Before the change the index value "+Arrays.toString(numbers));
        // Reassign the value at index 4 to 45
        numbers[4]= 45;
        //print the array after changing the value of index 5
        System.out.println("\nAfter update the index value at 5 "+Arrays.toString(numbers));

        // Reassign the value at index 5 to 99
      //  numbers[5]=99;
       // System.out.println(Arrays.toString(numbers)); // throw arrayIndexOutOfBound Exception
    }

    // Exercise # 5

    static void stringArrayExample(){
        //declare an array
        String[] words = {"Test","Love","mouse","Phone","XPS","macbook pro"};

        //print the array elemets with the help of for each loop

        for(String word : words){
            System.out.print("[ "+word+" ]");
        }
        System.out.println("Total words "+words.length);
    }

    // Task # 6
    static void printArrayExercise6(){
        String[] words = {"Test","Love","mouse","Phone","XPS","macbook pro"};
        String[] myWords = words;
        myWords[0] = "z";

        // print first array
        System.out.println("print first array");
        System.out.println(Arrays.toString(words));

        // print second array
        System.out.println("printing second array");
        System.out.println(Arrays.toString(myWords));

        // reason is that
        // in java array are reference in type

        /*
            In here Task # 7 start
            @author Tahir Mehboob
         */

        // alternative approach for doing this instead of using new keyword

        String[] newArray = Arrays.copyOf(words, words.length);
        // when we try to assign new index its not reference to original array
        newArray[0] = "ALPHA";
        System.out.println("printing Third array");
        System.out.println(Arrays.toString(newArray));

    }

    // Task # 8

    static void loopPrintInAscendingOrder(){
        System.out.println();
        for(int i=0 ; i<=10 ; i++){
            System.out.print("[ "+i+" ]");
        }
        System.out.println();
    }

    // Task # 9

    static void loopPrintInDescendingOrder(){
        System.out.println();
        for(int i=10 ; i>=0 ; i--){
            System.out.print("[ "+i+"]");
        }
        System.out.println();
    }

    // Task # 10
    static void addingAllNumberIntoArray(){
        // create an array. Remember to manually set the size
        int[] myNumber = new int[10];

        System.out.println("\n Array Adding Program ");
        // create a for loop which goes from 0 to 10, adding each value to an array
        for(int i=0 ; i<10 ; i++){
            myNumber[i] += i;
        }
        // print our array
        for(int z : myNumber){
            System.out.print(z+" ");
        }
    }

    // Task # 11

    static void sumAllNumberInArray(int n){
        int[] numbers = {10, 5, 7, 3, 8};
        int sum =0;

        for(int i :numbers){
            sum += i;
        }
        System.out.println("Total Sum of array elements"+sum);

    }

    // Task # 12
    static void arrayWordsCapital(){
        System.out.println();
        String[] words = {"i", "sure", "do", "love", "bees"};
                for(String word : words){
                    System.out.print("[ "+word.toUpperCase()+" ]");
                }
    }

    //Task # 13

    static void arrayFirstLetterCapital(){
       String[] words =  {"i", "sure", "do", "love", "bees"};
        System.out.println("\nArray First Word Capital Letter Program ");
       for(String word : words){
           String firstLetter = word.substring(0,1).toUpperCase();
           String remainingLetter = word.substring(1);
           System.out.println(firstLetter+ remainingLetter);
       }

    }

    /*
    Task 13 second approach
    @author Tahir Mehboob
     */
    //Task # 13
    static void arrayFirstWordLetterCapital(){
        String[] words =  {"i", "sure", "do", "love", "bees"};
        System.out.println("\n Second Way to create First Word Capital in an Array");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            // Capitalize the first letter and keep the rest unchanged
            words[i] = Character.toUpperCase(word.charAt(0)) + word.substring(1);
        }
        //print the Array
        System.out.print("["+Arrays.toString(words)+"]");
    }
    // Task # 14

    /**
   Write a program that reverses an array of Strings
   String[] content = {"you", "are", "how", "hello"}
   Tip. Use for loop and you to start at highest index.
   Output should be: hello how are you?. Note question mark at the end
     @author Tahir Mehboob
    **/

    static void reverseArray(){
        String[] content = {"you", "are", "how", "hello"};
        System.out.println("\n before reverse the array "+Arrays.toString(content)+"\n");
        // when working on index using i loop for indexing
        for(int i=content.length-1; i>=0;i--){
            System.out.print(" "+content[i]+" ");
        }
        System.out.print("?");
    }

     /*
        Write a program that adds total amount for this string "0.90, 1.00, 9.00, 8.78, 0.01".

        Tip:
        - String input = "0.90, 1.00, 9.00, 8.78, 0.01";
        - create variable to store result. double result = 0;
        - convert string to array by using the String[] numbers = input.split(", ")
        - then loop.
        - convert each string to decimal and add to current result
            - use Double.parseDouble(string) to convert a string to double
    */
    /**
     * Task 15
     * string into array and Sum the Total
     * @author Tahir Mehboob
     */

    static void stringToArraySumTotal(){
        // define String
        String input = "0.90, 1.00, 9.00, 8.78, 0.01";
        // initalize the result variable
        double result = 0.0;

        // split indiviual string element into array element
        String [] numbersArray = input.split(",");

        //using loop to add individual array element into single variable
        for(int i=0 ; i<numbersArray.length ; i++){
            result += Double.parseDouble(numbersArray[i]);
        }
        // print the total amount
        System.out.println("\nThe total amount is "+result);

    }

    // Task # 16 and 17
    // 16 is using command like javac file.java
    // passing argument java file for bar baz
    /*

    Write a program that takes arguments from the program args and loops through args and prints each item in args
    Compile using: javac and run using: java
    i.e. javac Exercise5.java | java Exercise5 foo bar baz
    */

    public static void main(String[] args){
        // Loop through the command-line arguments (args) and print each item
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + (i + 1) + ": " + args[i]);
        }
    }



}
