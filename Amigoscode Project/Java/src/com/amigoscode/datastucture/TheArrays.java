package com.amigoscode.datastucture;

import java.util.Arrays;

public class TheArrays {

    public static void practiceArrays(){
        String[] colors = new String[5];
        colors[0] = "red";
        colors[1] = "green";
        colors[2] = "blue";

        System.out.println(colors);
        System.out.println(Arrays.toString(colors));

        try {
            System.out.println(colors[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        // how to print the array
        // 1st by using for loop or index loop
        for(int i = 0; i < colors.length; i++){
            System.out.println(colors[i]);
        }
        // 2nd by using for each loop or enhance for loop
        for(String color : colors){
            System.out.println(color);
        }
        // 3rd way by using Stream api
        System.out.println("by Using Arrays Streams ");
        Arrays.stream(colors).forEach(System.out::println);
    }

    public static void main(String[] args) {
        practiceArrays();
    }

}
