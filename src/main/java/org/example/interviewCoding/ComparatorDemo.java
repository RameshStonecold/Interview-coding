package org.example.interviewCoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

    public static void main(String[] args) {

        comparatorUsingCompareTo();
    }


    private static void comparatorUsingCompareTo(){
        List<String> a1 = Arrays.asList("equity", "stocks", "gold", "foreign exchange", "fixed income", "future");


        a1.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(" Sorted list "+a1);
    }
}
