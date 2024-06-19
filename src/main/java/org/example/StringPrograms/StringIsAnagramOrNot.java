package org.example.StringPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class StringIsAnagramOrNot {

    public static void main(String[] args) {
        System.out.println("UsingArrays equals anagram or not -->Keep and Peek:: "+isAnagramOrNotUsingArraysEquals("Keep", "Peek"));
        System.out.println("UsingArrays equals anagram or not --> :: "+isAnagramOrNotUsingArraysEquals("Mother In Law", "Hitler Woman"));
    }

    private static boolean isAnagramOrNotUsingArraysEquals(String str1, String str2){

            String s1 = str1.replaceAll("\\s", "");
            String s2 = str2.replaceAll("\\s", "");
            boolean status = true;
            if (s1.length() != s2.length()) {
                status = false;
            } else {
                char[] ArrayS1 = s1.toLowerCase().toCharArray();
                char[] ArrayS2 = s2.toLowerCase().toCharArray();
                Arrays.sort(ArrayS1);
                Arrays.sort(ArrayS2);
                status = Arrays.equals(ArrayS1, ArrayS2);
            }
            if (status) {
                System.out.println(s1 + " and " + s2 + " are anagrams");
            } else {
                System.out.println(s1 + " and " + s2 + " are not anagrams");
            }
            return status;
        }

    }
