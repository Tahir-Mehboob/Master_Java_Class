package com.amigoscode.bigdecimal;

import java.math.BigDecimal;

public class PracticeBigDecimal {

    // problem occur when dealing with double

    private static void problemWithDoubleDatatype(){
         double number1 = 0.02;
         double number2 = 0.03;
         double result = number2 - number1;
         // result 0.009999999999999998 here it is the problemm

        System.out.println(result);
    }

    private static void dealingWithMoneyUseBigDecimal(){

        /**
         * Dealing with Money Use BigDecimal
         * mostly use in  Banking sector , Stocks
         * @Author Tahir Mehboob
         */

        BigDecimal number1 = new BigDecimal("0.01");
        BigDecimal number2 = new BigDecimal("0.02");
        BigDecimal result = number2.subtract(number1);
        System.out.println(""+result);

        System.out.println(BigDecimal.TEN);
        System.out.println(BigDecimal.ZERO);
        System.out.println(BigDecimal.TEN.compareTo(new BigDecimal("112")));

    }

    public static void main(String[] args) {
       // problemWithDoubleDatatype();
        dealingWithMoneyUseBigDecimal();
    }
}
