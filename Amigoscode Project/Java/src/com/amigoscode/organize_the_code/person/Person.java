package com.amigoscode.organize_the_code.person;

import com.amigoscode.organize_the_code.car.Car;

import java.util.Arrays;
import java.util.Objects;

public class Person {

    private static int count;

    static {
        System.out.println("start: static initalizaiton");
        count=0;
        System.out.println("end : static initalizaiton");
    }


    private String fistName;
    private String lastName;
    private Address address;
    private int age;
    private Car[] car;
    private Gender gender;
    //private Cat[] cat;


    public Person(){

    }

    // initalize the instance block

    {
        System.out.println("start: Instance Block");
        count++;
    }


    public Person(String fistName, String lastName, Address address, int age, Car[] car, Gender gender) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.address = address;
        this.age = age;
        this.car = car;
        this.gender = gender;
      //  this.cat = cat;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car[] getCar() {
        return car;
    }

    public void setCar(Car[] car) {
        this.car = car;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

   /* public Cat[] getCat() {
        return cat;
    }

    public void setCat(Cat[] cat) {
        this.cat = cat;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(fistName, person.fistName) && Objects.equals(lastName, person.lastName) && Objects.equals(address, person.address) && Objects.deepEquals(car, person.car) && gender == person.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fistName, lastName, address, age, Arrays.hashCode(car), gender);
    }

    @Override
    public String toString() {
        return "Person{" +
                "fistName='" + fistName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", age=" + age +
                ", car=" + Arrays.toString(car) +
                ", gender=" + gender +
                '}';
    }
}
