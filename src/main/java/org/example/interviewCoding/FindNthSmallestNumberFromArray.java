package org.example.interviewCoding;

import java.util.stream.IntStream;

public class FindNthSmallestNumberFromArray {

    public static void main(String[] args) {
        int arr[] = {4,3,7, 8, 10, 11 };
        printNthSmallestNo(arr);
    }


    public static void printNthSmallestNo(int arr[]){
        int k=2;
        IntStream.of(arr).sorted().skip(k-1).min().ifPresent((System.out::println));
    }

}
