package org.example.interviewCoding;

import java.util.Arrays;
import java.util.List;

public class FindProductOfNonNegativeInteger {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(4, 5, -6, 7, -1, 2, -3);
       product(integerList);

    }

    private static void product(List<Integer> list){

       int n = list.stream().filter(num -> num>0).mapToInt(Integer::intValue).reduce(1,(a,b)-> a*b);
        System.out.println(n);
    }


}
