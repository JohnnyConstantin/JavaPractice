package com.company;

public class StudentNotFoundException extends Exception {

    StudentNotFoundException(String errorMessage){
        super(errorMessage);
    }
}
