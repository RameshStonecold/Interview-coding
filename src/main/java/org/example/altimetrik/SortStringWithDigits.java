package org.example.altimetrik;

import java.util.Arrays;

public class SortStringWithDigits {

    public static void main(String[] args) {

        String str ="1231123abbcabcdf";
        //remove duplicates in string
        // o/p : 123abcdf
        removeDuplicates(str);
    }

    private static void removeDuplicates(String str){

        char [] chars =str.toCharArray();
        Arrays.sort(chars);

        StringBuilder sb = new StringBuilder();
        sb.append(chars[0]);

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != chars[i -1]) {
                sb.append(chars[i]);
            }
        }
        System.out.println(" String given input "+str+" & o/p is :: "+sb.toString());
    }
}
