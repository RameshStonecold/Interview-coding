package org.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringContainsList {

    public static void main(String[] args) {

        String str = "Hello I am Amani";

        List<String> list = Arrays.asList("dog","Hello","Aman","Good");
        usingJava8(str,list);
        System.out.println("----------------");
        withoutJava8(str,list);
        System.out.println("------------");
        findUsingStream(str,list);
    }

    private static void usingJava8(String str, List<String>list){

        Stream<String> arry = Arrays.stream(str.split(" "));
        boolean bi =arry.anyMatch(list::contains);
        System.out.println("check " + bi);
    }

    public static List<String> findUsingStream(String search, List<String> list) {
        List<String> matchingElements = list.stream()
                .filter(str -> str.trim().contains(search))
                .collect(Collectors.toList());
          System.out.println(" using java8 filter :: "+matchingElements);
        return matchingElements;
    }

        private static void withoutJava8(String str,List<String> list){
        boolean b = false;
        String [] arry =str.split(" ");

        int count =0;
        for (String str1 : list){
            if (str1.contains(arry[count])){
                b=true;
            }
            count++;
        }
        System.out.println( "Check without java8 :: "+b);
    }
}
