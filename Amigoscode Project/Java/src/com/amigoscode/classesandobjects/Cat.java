package com.amigoscode.classesandobjects;

public class Cat {

    private String name;
    private int age;
    private String Color;

    //default constructor
    public Cat() {
    }

    //Constructor with parameter

    // Constructor overloading
    public Cat(String name) {
        this.name = name;
        this.age = 0;
    }
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name, int age, String Color) {
          /*
              this.name = name;
              this.age = age;
          */
        this(name, age);
        this.Color = Color;
    }


    public String meaow() {
        return name + " Meaow Meaow..";
    }

    // create getter and setter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // toString use to print the object or object fields
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Color='" + Color + '\'' +
                '}';
    }
}
