package org.example.interviewCoding;

import java.util.Arrays;
import java.util.List;

public class SumOfIntegerArray {

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3,6,4,7,8,9,10);
       System.out.println( "Total sum of array :: "+sumOfArray(arr));
    }

    private static int sumOfArray(List<Integer> arr){
        int s =arr.size();

        int sum =0;
        for (int i=0; i<s;i++){
            sum=sum+ arr.get(i);
        }
        return sum;
    }
}
