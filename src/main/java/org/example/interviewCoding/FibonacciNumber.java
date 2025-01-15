package org.example.interviewCoding;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FibonacciNumber {

    public static void main(String[] args) {

        int count = 10;
        fibonacciUsingStringBuilder(count);
        System.out.println("----------------------- ");
        fibbinocciUsingForLoopIntegerArr(count);
        System.out.println("----------------------- ");
        fibonacciWithRecursive(count);
        System.out.println("-----------------------------");
        usingJava8(count);
    }



    public static void fibonacciUsingStringBuilder(int count){
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
       System.out.println("Using StringBuilder :"+str);
    }

    public static void fibbinocciUsingForLoopIntegerArr(int count){
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


        private static void usingJava8(int count){

        String result = IntStream.range(0, count)
                .mapToObj(FibonacciNumber::generateIntstream3)
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
            System.out.println("Using java 8 : "+result);
        }



    private static int generateIntstream3(int n) {
        if (n <= 1) return n;

        // Generate Fibonacci numbers using a loop for range [2, n]
        int[] fib = new int[]{0, 1}; // Mutable structure to hold the last two Fibonacci numbers
        IntStream.rangeClosed(2, n).forEach(i -> {
            int next = fib[0] + fib[1];
            fib[0] = fib[1];
            fib[1] = next;
        });
        return fib[1]; // Return the nth Fibonacci number
        }

        }

