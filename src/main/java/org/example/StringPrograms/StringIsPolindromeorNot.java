package org.example.StringPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class StringIsPolindromeorNot {

    public static void main(String[] args) {


        checkPolindrome();
        System.out.println("-------------------");

        System.out.println("Polindrome :: "+ withoutUsingPredefinedMethod());
    }

    private static void checkPolindrome(){
        String original ="";
        String reverse = "";
        Scanner in = new Scanner(System.in);
        int length;
        System.out.println("Enter the number or String");
        original = in.nextLine();
        length = original.length();
        for (int i =length -1; i>=0; i--) {
            reverse = reverse + original.charAt(i);
        }
        System.out.println("reverse is:" +reverse);

        if(original.equals(reverse))
            System.out.println("The string '"+ original+"' is palindrome");
        else
            System.out.println("The number is not a palindrome");

    }

    private static boolean withoutUsingPredefinedMethod(){

        Scanner in = new Scanner(System.in);
        int length;
        System.out.println("Enter the number or String :: ");
        String str = in.nextLine();

        char[] reverse = str.toCharArray();
        int size = reverse.length;
        char[] original = Arrays.copyOf(reverse, size);

        for (int i = 0; i < size / 2; i++) {
            char temp = reverse[i];
            reverse[i] = reverse[size - i - 1];
            reverse[size - i - 1] = temp;
        }

        System.out.println("Original Array: "
                + Arrays.toString(original));
        System.out.println("Reverse Array: "
                + Arrays.toString(reverse));

        if (Arrays.equals(reverse, original)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
        return false;
    }

}
