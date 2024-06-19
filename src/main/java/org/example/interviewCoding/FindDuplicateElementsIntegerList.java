package org.example.interviewCoding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElementsIntegerList {


    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set = new HashSet();
        myList.stream()
                .filter(n -> !set.add(n))
                .forEach(System.out::println);

        usingJava8UniqueNums(myList);
    }


    private static void usingJava8UniqueNums(List<Integer> integers){


            List<Integer> uninqueNums = integers.stream().sorted().distinct().collect(Collectors.toList());

        //System.out.print(uninqueNums);
    }
}
