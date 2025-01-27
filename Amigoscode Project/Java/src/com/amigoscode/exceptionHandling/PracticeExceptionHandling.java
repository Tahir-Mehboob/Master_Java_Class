package com.amigoscode.exceptionHandling;

public class PracticeExceptionHandling {

    /**
     * in this class dealing with exception Handling and dealing with Errors
     * @param args
     */

    private  static void tryToGenerateException(){


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
        } catch (Exception e){
            System.out.println(e.getMessage()) ;
        }
        finally {
            System.out.println("Finally block always run");
        }
    }

    public static void main(String[] args) {
        tryToGenerateException();
    }
}
