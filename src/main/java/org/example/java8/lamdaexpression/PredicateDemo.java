package org.example.java8.lamdaexpression;

public interface PredicateDemo{
     boolean compare(String input,String name);

     default void logStatement(){
         System.out.println("Hello world!");
     }
}
