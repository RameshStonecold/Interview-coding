package org.example.interviewCoding;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {
        int [] ar = {1,2,3,4,5,6,7};

        System.out.println( "The reverse array :: "+ Arrays.toString(reverse(ar)));
        System.out.println("-------------");

        int[] res =reverseAnArrayUsingForLoop(ar);

        System.out.println(Arrays.toString(res));
    }

    public static int[] reverse(int[] arr) {
        reverseArr(arr, 0, arr.length - 1);
        return arr;
    }

    // recursive method
    public static void reverseArr(int[] x, int i, int j) {

        // swap
        if (i < j) {
            int tmp = x[i];
            x[i] = x[j];
            x[j] = tmp;

            // recursive call
            reverseArr(x, ++i, --j);
        }
    }


    private static int[] reverseAnArrayUsingForLoop(int[] arr){
        // Method returns a new reversed array, based on the array which was passed to it.
        int[] newArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArray[arr.length - 1 - i] = arr[i];
        }

        return newArray;
    }

}
