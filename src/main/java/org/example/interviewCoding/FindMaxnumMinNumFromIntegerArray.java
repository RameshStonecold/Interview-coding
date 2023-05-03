package org.example.interviewCoding;

import java.util.*;

public class FindMaxnumMinNumFromIntegerArray {

    public static void main(String[] args) {

        //List<Integer> arr = Arrays.asList(1,3,5,7,9);
        List<Integer> arr = Arrays.asList(1,2,3,4,5);

        System.out.println( "The sum of all integer of min and max is :: "+minAndMaxNum(arr));
    }


    private static String minAndMaxNum(List<Integer> arr){

        int min =0;
        int max =0;
        Collections.sort(arr);
        Map<Integer,String> map = new  HashMap<>();
        int j= arr.size()-1;
        for (int i=0; i<arr.size()-1; i++){
            min += arr.get(i);
            max+= arr.get(j);
            j--;
        }

        map.put(min,"min");
        map.put(max,"max");

        return map.toString();
    }

}
