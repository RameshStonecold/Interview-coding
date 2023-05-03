package org.example.interviewCoding;

import java.util.Arrays;
import java.util.List;

public class SumOfAllNumbersinIntegerList {


    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int[] arry = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Sum :: "+integerList.stream().mapToInt(Integer::intValue).sum());

        sumOfDigitsOfNum(arry);

    }


    private static void sumOfDigitsOfNum(int[] array){

        int sum =0;

        for (int i=0; i<array.length; i++){
            sum+=array[i];
        }
        System.out.println( "Sum using for loop ::"+sum);
    }
}
