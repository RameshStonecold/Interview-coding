package org.example.interviewCoding;

import java.util.Arrays;

public class SortArrayIntegerWithoutPredefinedMethod {

    public static void main(String[] args) {
        int arr[] = {4,2,7,9,5,1,8,10};
        sortTheArray(arr);
    }


    private static void sortTheArray(int arr[]){

        int temp =0;
        for (int i=0;i< arr.length; i++){

            for(int j=i+1; j<arr.length; j++) {
                if (arr[i] > arr[j]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                }
            }
        }

        System.out.println("Sort the array without using method :"+Arrays.toString(arr));

    }

}
