package org.example.java8.reduce;

import java.util.Arrays;
import java.util.List;

public class ReduceToSum {


    public static void main(String[] args) {
        int [] numArr = {3,9,4,10,12,15,17};

        reduce(numArr);
    }



    private static  void reduce(int[] numArr){

        int total = Arrays.stream(numArr)
                .reduce(0, Integer::sum);

        System.out.println("Total elements "+ total);
    }

}
