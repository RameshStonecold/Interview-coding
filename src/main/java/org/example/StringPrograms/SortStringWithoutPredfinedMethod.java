package org.example.StringPrograms;

import java.util.Arrays;

public class SortStringWithoutPredfinedMethod {
    public static void main(String[] args) {

        String str = "zmhabciu";
        sortWithoutPredefinedMethod(str);
        System.out.println("----------------");
        usingWhileLoop(str);
    }



    private static void sortWithoutPredefinedMethod(String str){

        char[] chars =str.toCharArray();

        char temp ;
        for (int i=0; i<chars.length; i++){

            for (int j=0; j<chars.length; j++){

                if (chars[j]>chars[i]){
                    temp = chars[i];
                    System.out.println(temp+"---1");
                    chars[i] = chars[j];
                    System.out.println(chars[j]+"----2");
                    chars[j] = temp;
                    System.out.println(chars[j]+"-----3");
                }
            }
        }
        System.out.println( "Sorted String :: "+String.valueOf(chars) );
    }




    private static void usingWhileLoop(String str){

        // Converting string into an array for computation
        char[] arr = str.toCharArray();
        // Nested loops for comparison of characters
        // in above character array
        char temp;
        int i = 0;
        while (i < arr.length) {
            int j = i + 1;
            while (j < arr.length) {
                if (arr[j] < arr[i]) {   // i/p : ghfa
                    // Comparing the characters one by one
                    temp = arr[i];       // temp =g
                    arr[i] = arr[j];     // arr[i] h
                    arr[j] = temp;       //arr[j] = g
                }
                j += 1;
            }
            i += 1;
        }
        // By now loop is done means we have
        // iterated the whole array
        System.out.println(arr);
    }
}
