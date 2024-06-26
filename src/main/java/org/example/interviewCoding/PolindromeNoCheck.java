package org.example.interviewCoding;

import java.util.stream.IntStream;

public class PolindromeNoCheck {
    public static void main(String[] args) {
       int num = 3553;
        usingWileLoop(num);

        polindromeJava8(num);

        String str = "radar";
        stringPolindrome(str);
    }


    private static void usingWileLoop(int num){
        int originalNum = num;
        int rev =0;
        int rem =0;

        while (num!=0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num =num/10;
        }

        if(originalNum==rev){
            System.out.println("Given num : "+originalNum+" is Polindrome");
        }else {
            System.out.println("Given num : "+originalNum+" is not Polindrome");
        }
    }

    private static void polindromeJava8(int number){

        String numStr = String.valueOf(number);

        int reversedNum = IntStream.range(0, numStr.length())
                .map(i -> numStr.charAt(numStr.length() - 1 - i) - '0') // Get digits in reverse order
                .reduce(0, (a, b) -> a * 10 + b); // Combine them back into an integer

        if(reversedNum==number){
            System.out.println("The number is polindrome :"+number);
        }else {
            System.out.println("Not polindrome");
        }

    }


    private static void stringPolindrome(String str){
        StringBuilder rev= new StringBuilder();

        for (int i=str.length()-1; i>=0; i--){
        rev.append(str.charAt(i));

        }
        System.out.println("Original str : "+str);
        System.out.println("Reverse str : "+rev);

        if(rev.toString().equalsIgnoreCase(str)){
            System.out.println("Polindrome");
        }else {
            System.out.println("Not polindrom");
        }

    }

    public static void usingStringJava8(String str){
        StringBuilder rev= new StringBuilder();

    }



}
