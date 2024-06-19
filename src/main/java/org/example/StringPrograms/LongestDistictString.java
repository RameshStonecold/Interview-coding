package org.example.StringPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LongestDistictString {

    public static void main(String[] args) {


        String[] words = {"de","ab","cd","ef","bc","gh"};

       int N = words.length;

       Arrays.sort(words);
       System.out.println(Arrays.toString(words));

       StringBuilder str = new StringBuilder();
       for (int i=1; i< N; i++){

       }

       System.out.println();
       System.out.println(str);

    }


    private static boolean isStringCharsPresent(String[] arr, String str){


       Arrays.stream(arr).anyMatch(s -> !Arrays.equals(s.toCharArray(), str.toCharArray()));

       Object obj = new Object();

       return false;
    }
}
