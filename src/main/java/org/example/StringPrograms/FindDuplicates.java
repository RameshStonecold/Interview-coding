package org.example.StringPrograms;

import java.util.Arrays;

public class FindDuplicates {

    public static void main(String[] args) {

        String str = "1233111abac";

        System.out.println("Duplicates here :: "+duplicates(str));
    }
    private static String duplicates(String str){
        char[] chrr = str.toCharArray();
        int n = chrr.length;

        Arrays.sort(chrr);
        StringBuilder sb = new StringBuilder();

        for (int i=1; i<n; i++){

            if(chrr[i]==chrr[i-1]){
                sb.append(chrr[i]);
            }
        }
        return sb.toString();
    }
}
