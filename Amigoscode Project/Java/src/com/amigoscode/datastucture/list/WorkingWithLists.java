package com.amigoscode.datastucture.list;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {


    public static void main(String[] args) {

        List<String> colors = new ArrayList();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        System.out.println(colors.get(1));
        System.out.println(colors.get(2));

        System.out.println();
        System.out.println(colors.contains("yellow"));
        System.out.println();
        // print the element by using for each
        colors.forEach(System.out::println);

        for(String color : colors){
            System.out.println(" \n "+color);
        }

    }
}
