package com.amigoscode.organize_the_code.person;

public class PersonService {

    public int addPerson(Person person) {
        if(person.getFistName().isBlank()){
            throw new IllegalArgumentException("First name cannot be blank.");
        }
        return 1;
    }
}
