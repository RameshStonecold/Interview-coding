package org.example.StringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DIstinctCharCount {
    public static void main(String[] args) {

        String str = "hi there, i am pankaj";

        System.out.println("Unique elements : "+usingJava8(str));

    }

    private static Map<Character,Long> usingJava8(String str){

      Map<Character,Long> map = str.chars().mapToObj(x->(char)x).distinct().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

      return map;

    }

}
