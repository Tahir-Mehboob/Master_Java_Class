package com.amigoscode.classesandobjects;

import java.util.Arrays;

public class PracticeClassesAndObjects {


   /* public static void main(String[] args) {
                Cat cat1 = new Cat("oggy",2,"light blue");
                System.out.println(cat1);
        //cat.setName("ROSI");
       *//* System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println(cat.meaow());*//*

      *//*  cat.setName("Mano");
        System.out.println(cat.meaow());*//*

        Cat cat2 = new Cat("Oggy",2,"light blue");
        *//*System.out.println(cat2.getName());
        System.out.println(cat2.getAge());*//*
        System.out.println(cat2);

        String names[]  = {"Hip","Pop"};
        // dirtly print names they return object address
        // for arrays use Arrays.toString()
      //  System.out.println(Arrays.toString(names));

        // comparing object reference
        // different ref but same values result false
        System.out.println(cat1==cat2);

       // cat2 = cat;
        // assign same reference to other object result true

        System.out.println("When we assigning the referenec of object to another and then compare "+(cat==cat2) );

        // .equal compare two objects values

        // Best Practice
        // use .equals
        // .equals use to when we compare two values

        System.out.println(cat1.equals(cat2));

        *//**
         *
         * Creat Person class object
         * @author Tahir Mehboob
         *//*
        // initalize the cat array because of passing into the person constructor
        Cat[] cats = {cat1, cat2};
        Person p1 = new Person("Zaffar","Ahmed",Gender.MALE,cats);

    }
*/
    // inner class / class inside another class
    /*static class Cat{
        private String name;

        public String meaow(){
            return name+" Meaow Meaow..";
        }
    }*/

}
