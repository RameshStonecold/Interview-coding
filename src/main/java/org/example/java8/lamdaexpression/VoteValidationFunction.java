package org.example.java8.lamdaexpression;

@FunctionalInterface
public interface VoteValidationFunction {

    boolean validateAge(int age);

    static void validate(){

    }
}
