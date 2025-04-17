package com.amigoscode.optional;

public class NullPointerExample {

    public static void main(String[] args) {

        String name = "Tahir";
        String address = null;

        Cat  rosie = new Cat("Manoo");

        System.out.println(name.toUpperCase());
    //    System.out.println(address.toUpperCase());

        System.out.println(rosie.toString());

       // rosie = null;
        System.out.println(rosie.getName().toString());

    }


    static class Cat{

        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
