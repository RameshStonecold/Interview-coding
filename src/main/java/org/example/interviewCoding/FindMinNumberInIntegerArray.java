package org.example.interviewCoding;

import java.util.Comparator;
import java.util.stream.Stream;

public class FindMinNumberInIntegerArray {

    public static void main(String[] args) {
        Integer min = Stream.of(1, 2, 3, 4, 5, 6,7)
                .min(Comparator.comparing(Integer::valueOf))
                .get();
        System.out.println("The Minimum number is: " + min);
    }
}
