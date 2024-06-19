package org.example.interviewCoding;

import java.util.Arrays;

public class FibonacciNumber {

    public static void main(String[] args) {

        int count = 10;
        String fibNum = fibonacciUsingStringBuilder(count);
        System.out.println("Fibonacci Num Using String Builder:: "+ fibNum);
        System.out.println("----------------------- ");
        fibbinocciUsingForLoopReturnIntegerArr(count);
        System.out.println("----------------------- ");
        fibonacciWithRecursive(count);
    }



    public static String fibonacciUsingStringBuilder(int count){
        int a = 0;
        int b = 1;
        int c = 1;

        StringBuilder str = new StringBuilder();

        for (int i = 1; i <= count; i++) {

            str.append(a).append(", ");

            a = b;
            b = c;
            c = a + b;
        }
        return str.toString();
    }

    public static void fibbinocciUsingForLoopReturnIntegerArr(int count){
        int a = 0;
        int b = 1;
        int c = 1;
        int farr[] = new int[count];
        for (int i=0 ; i<count; i++){
            farr[i] = a;
            a =b;
            b=c;
            c= a+b;
        }
        System.out.println("Using for loop return int arr[] :"+Arrays.toString(farr));

    }


    public static void fibonacciWithRecursive(int count){

        int a=0, b=1;
        int n=0;
        int []arr = new int[count];
        for (int i=0; i<count; i++){
            arr[i] =fibonacci(count);
        }
         System.out.println("Using recursive : "+Arrays.toString(arr));

    }

        public static int fibonacci(int n)  {
            if(n == 0)
                return 0;
            else if(n == 1)
                return 1;
            else
                return fibonacci(n - 1) + fibonacci(n - 2);
        }


}
