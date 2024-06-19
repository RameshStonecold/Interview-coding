package org.example.interviewCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SumOfIntegerArray {

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3,6,4,7,8,9,10);
       //System.out.println( "Total sum of array :: "+sumOfArray(arr));

        sort();
    }

    private static int sumOfArray(List<Integer> arr){
        int s =arr.size();

        int sum =0;
        for (int i=0; i<s;i++){
            sum=sum+ arr.get(i);
        }
        return sum;
    }

    private static void sort(){

        List<Integer> nums = new  ArrayList<>();
        nums.add(1);
        nums.add(21);
        nums.add(31);
        nums.add(11);

        var l =nums.stream().sorted().collect(Collectors.toList());

        System.out.println(l);

    }
}
