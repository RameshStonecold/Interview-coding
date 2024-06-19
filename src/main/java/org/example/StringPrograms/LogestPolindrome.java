package org.example.StringPrograms;

import java.util.Comparator;
import java.util.List;

public class LogestPolindrome {
    public static void main(String[] args) {

polindrome();

    }

    private static void polindrome(){

        List<String> list = List.of("level", "hello", "radar", "world", "madam", "java", "Malayalam");


      String str =  list.stream().filter(x-> new StringBuilder(x).toString().equalsIgnoreCase(x)).max(Comparator.comparing(String::length)).orElse("");

      System.out.println( str);
    }

}
