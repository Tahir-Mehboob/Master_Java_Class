package com.amigoscode.optional;

import java.util.Objects;
import java.util.Optional;

public class TackleNullPointerException {


    //1st way to do that by using
    //If Else Statement

    public static void firstApproach(){
        String name = null;

        if(name == null ){
            System.out.println("name is null");
        }
        else{
            System.out.println("name is not Null");
        }
    }

    // 2nd Approach to tackle with
    // Null Pointer Exception

    public static void secondApproachByUsingTryCatch(){
        String name = "zaffer";
        try{
            System.out.println(name);
        }catch (NullPointerException npe){
            npe.printStackTrace();
        }
    }

    //3rd Way to handle null pointer exception
    //by using  Objects.requireNonNull() method

    public static void printToUpperCase(String name){
        Objects.requireNonNull(name, "name is null");
        System.out.println(name.toUpperCase());
    }

    // 3rd Way to do that handle null pointer exception

    public static void optionalExampleCode(){
        String brand = "ZARA";
        Optional<String> brandOptional = Optional.ofNullable(brand);

        System.out.println(brandOptional.isEmpty());

        if(brandOptional.isEmpty()){
            System.out.println("Brand is empty");
        }else{
            System.out.println(brandOptional.get());
        }

        // below code use inseated of using if else example

        brandOptional.ifPresentOrElse(b->{
            System.out.println(b.toUpperCase());},
                () -> System.out.println("Brand is empty"));

        var result:String = brandOptional.orElse("Amigoscode Foundation");
        System.out.println(result);
    }

    public static void main(String[] args) {
     //   firstApproach();
       // secondApproachByUsingTryCatch();
        //printToUpperCase("Baby");
        //printToUpperCase(null);

        optionalExampleCode();
    }


}
