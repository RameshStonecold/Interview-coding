package org.example.interviewCoding;

import java.util.stream.IntStream;

public class PolindromeNoCheck {
    public static void main(String[] args) {
       int num = 354513;
        usingWileLoop(num);

        polindromeJava8(num);

        String str = "radar";
        stringPolindrome(str);

       usingLeftRight(num);

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

    /*
    IntStream.range(0, numStr.length())
This creates an IntStream (a stream of integers) that ranges from 0 to numStr.length() - 1. It effectively iterates over each digit of the number.
3. .map(i -> numStr.charAt(numStr.length() - 1 - i) - '0')
For each index i, this step retrieves the character at the reverse position of the string.
numStr.charAt(numStr.length() - 1 - i) takes the character at position i from the end of the string.
Subtracting '0' from the character converts it from a char representing a digit (e.g., '3') to its corresponding integer value (e.g., 3).
This effectively reverses the digits of the number.

    This reduces the stream of reversed digits back into a single integer.
The operation starts with a = 0 and processes each digit b from the stream.
a * 10 + b combines the digits by shifting a one position to the left (multiplying by 10) and adding the next digit b.
For example, if the reversed digits are [4, 3, 2, 1], the reduction works as follows:
Initial value a = 0
First iteration: 0 * 10 + 4 = 4
Second iteration: 4 * 10 + 3 = 43
Third iteration: 43 * 10 + 2 = 432
Fourth iteration: 432 * 10 + 1 = 4321
This gives us the reversed number.*/

    private static void polindromeJava8(int number){

        String numStr = String.valueOf(number);

        int reversedNum = IntStream.range(0, numStr.length())
                .map(i ->numStr.charAt(numStr.length() - 1 - i) - '0') // Get digits in reverse order
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

    private static void usingLeftRight(int num ){


        boolean flag = false;
        String str = String.valueOf(num);
        int left =0, right = str.length()-1;

        while(left<right){
            var l =str.charAt(left);
            var r =str.charAt(right);

            if(str.charAt(left) != str.charAt(right)){
                flag= true;
            }
             left++;
             right--;
        }

        if(flag){
            System.out.println(num +"is not Polindrome ");
        }else {
            System.out.println(num +"is Polindrome ");
        }

    }


}
