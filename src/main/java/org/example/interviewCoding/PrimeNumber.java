package org.example.interviewCoding;

import java.util.function.Function;
import java.util.stream.IntStream;

public class PrimeNumber {
    public static void main(String[] args) {
        int num =6;
        isPrimeNumber(num);
        /*
        * i<=n/2 indicates that the number 'n' which is divisible by 2 must be with in the range of 2 and n/2.
        *
        * when give value n=3 or n=5 or n=7. it will skip the loop and directly consider as prime number
        *
        * */
        System.out.println(num+" is Prime Number " +isPrimeUsingSqrtF(num));

        /*
        *
        * */

        isPrimeUsingWhile(num);


        /*
        * Using java 8 functions
        * */

        usingPredicateAndFunction(num);
    }




    private static boolean isPrimeNumber(int num){
            boolean flag = false;
            for (int i = 2; i <=num / 2; i++) {
                flag =true;
                if (num % i == 0) {
                    flag = false;
                    break;
                }

            }

        if(flag){
            System.out.println("Number is prime :"+num);
        }else {
            System.out.println("Number is not prime no :"+num);
        }
        return flag;
    }





    private static boolean isPrimeUsingSqrtF(int num){
         System.out.println("Math.sqrt of num :"+Math.sqrt(num) +" ");
        int sqrt = (int) Math.sqrt(num) + 1;
        System.out.println("int sqrt =(int) Math.sqrt(num)+1 value is "+sqrt);

        boolean flag = false;
        for (int i = 2; i < sqrt; i++) {
            if (num % i == 0) {
                // number is perfectly divisible - no prime
                 flag=false;
            }
        }
         flag=true;

        if(!flag){
            System.out.println("Number is prime no :"+num);
        }else {
            System.out.println("Number is not prime no :"+num);
        }
        return flag;
    }


    private static void isPrimeUsingWhile(int num){
     boolean flag= true;
        if(num<=1){
            flag= false;
        }
        int i =2;
        while(i<=Math.sqrt(num)){
            if(num%i==0){
                flag= false;
            }
            i++;
        }

        if (flag) {
            System.out.println(num + " is a prime number using while loop.");
        } else {
            System.out.println(num + " is not a prime number using while loop.");
        }

    }


    private static void usingPredicateAndFunction(int num){

        Function<Integer, Boolean> isPrime = number->{
            if(number<=1) return false;
            return IntStream.range(2, (int) Math.sqrt(number)).noneMatch( i -> number%i==0);
        };
        System.out.println("Using Functions : ");
        System.out.println( isPrime.apply(num) ? +num+" is Prime" : +num+"is Not Prime");


    }


}
