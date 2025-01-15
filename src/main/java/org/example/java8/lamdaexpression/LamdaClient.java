package org.example.java8.lamdaexpression;


public class LamdaClient {

    public static void main(String[] args) {

        String input = "John123";
        String original = "John123";

        System.out.println(compareNames(input,original));

    }

    public static boolean compareNames(String inputName, String originalName){
        PredicateDemo p = String::equals;
        p.logStatement();
       return p.compare(inputName,originalName);
    }


}
