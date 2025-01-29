package com.amigoscode.exceptionHandling;

import java.io.File;
import java.io.IOException;

public class PracticeExceptionHandling {

    /**
     * in this class dealing with exception Handling and dealing with Errors
     *
     * @param args
     */

    private static void tryToGenerateException() {


        // by create Number Format exception
        try {
            for (int i = 10; i >= 0; i--) {
                // System.out.println(i);
                //  System.out.println(10 / i + " value of i " + i);
            }

            // how to occur exception by number format
            int number = Integer.parseInt("50");
            System.out.println(number);

            System.out.println("Try block end ");
       /* }catch(NumberFormatException e){
           // e.printStackTrace();
            System.out.println("Falied to Parse 50x");
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }*/

            // combing to multiple catch block

     /*   }catch (NumberFormatException | ArithmeticException e){
            System.out.println( e.getMessage() ) ;  // printing the actual error or value of
           // e.printStackTrace(); // printing the reason to occur exception

        }*/

            // when we don't know what type of exception will occur then use Exception class
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally block always run");
        }
    }

    // try to generate check Exception means compile-time exception
    // e.g work with file

    private static void checkExceptionTest() {
        // File file = new File("src/foo.txt");
        File file = new File("src/foo.txt");
        System.out.println(new File("src/foo.txt").getAbsolutePath());

        // System.out.println("Attempting to create file at: " + file.getAbsolutePath());

        try {
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File created at: " + file.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            // System.out.println(e.printStackTrace());
        }

    }

    public static double divide(int a, int b) throws MyCheckException {
        if (b == 0) {
           throw new MyCheckException("Cannot Divide by zero ");
        }
        return a / b;
    }

    public static void main(String[] args) {
        //tryToGenerateException();
        //checkExceptionTest();
        try {
            System.out.println(divide(1, 0));

        } catch (MyCheckException unCheckedException) {
            //unCheckedException.printStackTrace();
            System.out.println(unCheckedException.getMessage());
        }
    }
}
