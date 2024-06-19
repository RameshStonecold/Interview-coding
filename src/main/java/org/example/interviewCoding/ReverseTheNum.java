package org.example.interviewCoding;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseTheNum {


    public static void main(String[] args) {
        String str="728";
        reverseTheNum(str);

        List<Integer> integers = Arrays.asList(1,3,6,8,9,10,15);
        reverseIntegerList(integers);

    }


    private static void reverseTheNum(String str){

       int n = Integer.parseInt(str);

       int num = n;
       int rem =0;
       int rev=0;
       while (num!=0){

          rem = num%10;

          rev =rev*10+rem;

          num = num/10;
       }

       System.out.println(rev);

    }

    private static void reverseIntegerList(List<Integer> integers){

        List<Integer> sortedIntegrs  =integers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());


        System.out.println(sortedIntegrs);
    }
}
