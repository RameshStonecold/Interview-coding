package org.example.interviewCoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class FindMaxnumber {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        int max =  myList.stream()
                .max(Integer::compare)
                .get();
        System.out.println(max);
    }

    private void anotherWayofFindMaxNum(){
        Integer max = Stream.of(1, 2, 3, 4, 5, 6,7)
                .max(Comparator.comparing(Integer::valueOf))
                .get();
        System.out.println("The Maximum number is: " + max);
    }
}
