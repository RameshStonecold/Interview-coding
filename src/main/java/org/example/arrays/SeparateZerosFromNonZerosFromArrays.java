package org.example.arrays;

import java.util.Arrays;

public class SeparateZerosFromNonZerosFromArrays {

    public static void main(String[] args) {


        int[] arr = {1,9,0,4,6,0,12,0,10,2};

        separateZerosFromArray(arr);
    }

    public static void separateZerosFromArray(int[] arr){

        int[] arr2= new int[arr.length];
        for (int i=0; i< arr.length; i++){
            if(arr[i]==0){
               arr2[ arr.length-1]=arr[i];
               
            }else {
                arr2[i]=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
