package org.example.interviewCoding;

import java.util.Arrays;
import java.util.stream.StreamSupport;

public class ReverseAnArray {

    public static void main(String[] args) {
        int [] ar = {1,2,3,4,5,6,7};

        System.out.println( "The reverse array :: "+ Arrays.toString(reverse(ar)));
        System.out.println("-------------");

        int[] res =reverseAnArrayUsingForLoop(ar);

        System.out.println(Arrays.toString(res));

        System.out.println("------------------");
        int [] arr = {1,2,3,4,5,6,7};
        reverseNumByLessSwap(arr);

        System.out.println("---------------");
        int [] arr1 = {1,2,3,4,5,6,7};
        usingReverseLoop(arr1);

        System.out.println("------------------");
        String str = "7408";
        reverseStringNum(str);

        System.out.println("---------------");
        String str2 = "7408";
        convertToNumReverseit(str2);
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

    private static void reverseNumByLessSwap(int a[]) {

        int n = a.length;

        int i, k, t;
        for (i = 0; i < n / 2; i++) {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }

        // printing the reversed array
        System.out.println("Reversed array using lessswap : \n");
        for (k = 0; k < n; k++) {
            System.out.println(a[k]);
        }
    }

    private static void usingReverseLoop(int arr[]){
        System.out.print("Using for loop reverse indexing : ");
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]);
        }
    }


    private static void reverseStringNum(String str){
          String str1 = "";
        for(int i=str.length()-1; i>=0; i--){
           str1+= str.charAt(i);
        }
        System.out.println("Reverse String "+str1 );

    }
    private static void convertToNumReverseit(String str){

        int num = Integer.parseInt(str);

        int rem =0;
        int rev =0;

        while(num!=0){
            rem =  num%10;
            rev = rev*10 + rem;
            num = num/10;

        }
        System.out.println("Convert the string num and reverse the number "+rev);
    }

}
